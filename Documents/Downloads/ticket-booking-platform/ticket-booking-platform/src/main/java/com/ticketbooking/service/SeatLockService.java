
package com.ticketbooking.service;

import java.time.Duration;
//import java.util.Collections;
import java.util.UUID;

import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.stereotype.Service;

@Service
public class SeatLockService {

    private final RedisTemplate<String, String> redisTemplate;

   
    public SeatLockService(
            RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public String lockSeat(Long seatId, Long userId) {

        String key = "seat:lock:" + seatId;

        String token = userId + ":" + UUID.randomUUID();

        Boolean locked = redisTemplate
                .opsForValue()
                .setIfAbsent(
                        key,
                        token,
                        Duration.ofMinutes(5)
                );

        return Boolean.TRUE.equals(locked) ? token : null;
    }

    public boolean isLockOwner(Long seatId, String token) {

        if (token == null) {
            return false;
        }

        String key = "seat:lock:" + seatId;

        String currentToken = redisTemplate
                .opsForValue()
                .get(key);

        return token.equals(currentToken);
    }

    public boolean releaseLock(Long seatId, String token) {

        String key = "seat:lock:" + seatId;

         String currentToken = redisTemplate.opsForValue().get(key);

        if (token != null && token.equals(currentToken)) {
        redisTemplate.delete(key);
        return true;
    }

   

    return false;
}
}

// system design concepts added here
/*Safe lock release: User 101 must not accidentally release User 202's lock.

Database consistency: Two users must never successfully book the same seat.

Failure handling: If booking fails, the temporary lock must be handled correctly.

Lock ownership: Only the user who owns a valid lock can proceed with the booking.
 */