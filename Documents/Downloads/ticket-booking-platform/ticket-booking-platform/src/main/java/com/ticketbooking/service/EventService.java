package com.ticketbooking.service;
import com.ticketbooking.entity.Event;
import com.ticketbooking.repository.BookingRepository;
import com.ticketbooking.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventService {
    private final BookingRepository bookingRepository;
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository, BookingRepository bookingRepository){
        this.eventRepository = eventRepository;
        this.bookingRepository = bookingRepository;
    }

    public Event createEvent(Event event){
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }

    public Event getEventById(Long id){
        return eventRepository.findById(id)
                             .orElseThrow(() -> 
                            new RuntimeException("event not found"));
    }
}
