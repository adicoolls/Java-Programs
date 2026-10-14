package com.ticketbooking.service;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class RedisTestService {

    private final RedisTemplate<String, String> redisTemplate;

    public RedisTestService(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
@PostConstruct
public void runTest() {
    testRedis();
}
    public void testRedis() {

        redisTemplate.opsForValue().set("name", "Aditya");

        String value = redisTemplate.opsForValue().get("name");

        System.out.println("Redis value: " + value);
    }
}
