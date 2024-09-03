package dev.panduka.hotel_booking_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.panduka.hotel_booking_api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
    User findByUsername(String username);
}
