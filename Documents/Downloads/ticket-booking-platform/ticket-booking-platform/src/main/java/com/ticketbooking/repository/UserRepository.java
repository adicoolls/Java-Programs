package com.ticketbooking.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ticketbooking.entity.User;


public interface UserRepository extends JpaRepository<User,Long>{
    
}
