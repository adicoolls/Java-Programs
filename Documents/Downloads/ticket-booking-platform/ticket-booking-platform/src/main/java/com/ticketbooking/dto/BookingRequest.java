package com.ticketbooking.dto;
import jakarta.validation.constraints.NotNull;
public class BookingRequest {
    @NotNull(message = "User ID is required")
    private Long userId;

    @NotNull(message = "Event ID is required")
    private Long eventId;

    @NotNull(message = "Seat ID is required")
    private Long seatId;

    private String token;


    public String getToken(){
        return token;
    }

    public void setToken(String token){
        this.token = token;
    }

    public Long getUserId(){
        return userId;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public Long getSeatId(){
        return seatId;
    }

    public void setSeatId(Long seatId){
        this.seatId = seatId;
    }
    public long getEventId(){
        return eventId;
    }
    public void setEventId(long eventId){
        this.eventId = eventId;
    }
}
