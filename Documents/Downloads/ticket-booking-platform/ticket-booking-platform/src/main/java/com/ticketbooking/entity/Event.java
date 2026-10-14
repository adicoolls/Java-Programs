package com.ticketbooking.entity;

import jakarta.persistence.*;
@Entity 
@Table(name="events")
public class Event {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String location;

    private int availableSeats;

    public Event(){

    }

    public Event(String name, String location, int availableSeats){
        this.name = name;
        this.location = location;
        this.availableSeats = availableSeats;
    }
      public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

 public int getAvailableSeats() {
    return availableSeats;
}

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAvailableSeats(int availableSeats) {
    this.availableSeats = availableSeats;
}
}
