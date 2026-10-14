package com.ticketbooking.service;

import com.ticketbooking.dto.BookingRequest;
import com.ticketbooking.entity.Booking;
import com.ticketbooking.entity.Event;
import com.ticketbooking.entity.Seat;
import com.ticketbooking.entity.User;
import com.ticketbooking.service.SeatLockService;
import com.ticketbooking.repository.BookingRepository;
import com.ticketbooking.repository.EventRepository;
import com.ticketbooking.repository.SeatRepository;
import com.ticketbooking.repository.UserRepository;
import org.springframework.stereotype.Service;
import com.ticketbooking.exception.ResourceNotFoundException;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;
    private final UserRepository userRepository;
    private final EventRepository eventRepository;
    private final SeatRepository seatRepository;
    private final SeatLockService seatLockService;

    public BookingService(
            BookingRepository bookingRepository,
            UserRepository userRepository,
            EventRepository eventRepository,
            SeatRepository seatRepository,
            SeatLockService seatLockService) {

        this.bookingRepository = bookingRepository;
        this.userRepository = userRepository;
        this.eventRepository = eventRepository;
        this.seatRepository = seatRepository;
        this.seatLockService = seatLockService;
    }

    // Create a new booking
    @Transactional
    public Booking createBooking(BookingRequest request) {

        User user = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        Event event = eventRepository.findById(request.getEventId())
                .orElseThrow(() -> new ResourceNotFoundException("Event not found"));

        Seat seat = seatRepository.findByIdForUpdate(
                request.getSeatId()).orElseThrow(() -> new ResourceNotFoundException("Seat not found"));

        
          if(seat.getEvent() == null || 
          !seat.getEvent().getId().equals(event.getId())){
            throw new IllegalArgumentException(
                "seat does not belong to the requested event"
            );
          }

        // verify Redis lock ownership
        boolean isOwner = seatLockService.isLockOwner(
                request.getSeatId(),
                request.getToken());

        if (!isOwner) {
            throw new RuntimeException("Invalid or expired seat lock");
        }
        if (seat.isBooked()) {
            throw new RuntimeException("Seat is already booked");
        }

        if (event.getAvailableSeats() <= 0) {
            throw new RuntimeException("No seats available");
        }

        // Mark seat as booked
        seat.setBooked(true);

        // Decrease available seats
        event.setAvailableSeats(event.getAvailableSeats() - 1);

        // Create booking
        Booking booking = new Booking();

        booking.setUser(user);
        booking.setEvent(event);
        booking.setSeat(seat);
        booking.setStatus("CONFIRMED");

        // Save changes
        seatRepository.save(seat);
        eventRepository.save(event);

        Booking savedBooking = bookingRepository.save(booking);

        // Release the Redis lock after the database transaction completes
        TransactionSynchronizationManager.registerSynchronization(
                new TransactionSynchronization() {
                    @Override
                    public void afterCompletion(int status) {
                        seatLockService.releaseLock(
                                request.getSeatId(),
                                request.getToken());
                    }
                });

        return savedBooking;
    }

    // Get all bookings
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    // Get booking by ID
    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Booking not found"));
    }

    // Cancel booking
    public Booking cancelBooking(Long id) {

        Booking booking = bookingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Booking not found"));

        Seat seat = booking.getSeat();
        Event event = booking.getEvent();

        if ("CANCELLED".equals(booking.getStatus())) {
            throw new RuntimeException("Booking is already cancelled");
        }

        // Make seat available again
        seat.setBooked(false);

        // Increase available seats
        event.setAvailableSeats(event.getAvailableSeats() + 1);

        // Change booking status
        booking.setStatus("CANCELLED");

        // Save changes
        seatRepository.save(seat);
        eventRepository.save(event);

        return bookingRepository.save(booking);
    }
}