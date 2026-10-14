package com.ticketbooking.entity;
import jakarta.persistence.*;

@Entity 
@Table(name = "seats")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String seatNumber;
    private boolean booked;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    public Seat(){

    }

    public void seat(String seatNumber, Event event){
        this.seatNumber = seatNumber;
        this.event = event;
        this.booked = false;
    }
      public Long getId() {
        return id;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public boolean isBooked() {
        return booked;
    }

    public Event getEvent() {
        return event;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

}
