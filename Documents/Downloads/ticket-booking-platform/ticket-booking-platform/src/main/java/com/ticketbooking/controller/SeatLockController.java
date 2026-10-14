package com.ticketbooking.controller;

import com.ticketbooking.service.SeatLockService;
import org.springframework.web.bind.annotation.*;
@RestController 
@RequestMapping("/api/seat-locks")
public class SeatLockController {
    private final SeatLockService seatLockService;

    public SeatLockController(SeatLockService seatLockService){
        this.seatLockService = seatLockService;
    }

    @PostMapping("/{seatId}")
    public String lockSeat(
        @PathVariable Long seatId,
        @RequestParam Long userId){
            String token = seatLockService.lockSeat(seatId, userId);

            if(token == null){
                return "Seat is already locked";
            }
            return "Seat locked successfully. Token : " + token;
        }

    @DeleteMapping("/{seatId}")
    public String releaseLock(@PathVariable Long seatId, @RequestParam String token){

        Boolean released = seatLockService.releaseLock(seatId, token);

        if(released){
            return "Seat is locked released";
        }

        return "Lock release failed. Invalid token or lock expired";
    }
}
