package dev.panduka.hotel_booking_api.dto;

import java.util.Date;

public record UserResponse(Integer id, String username, String email, Date createdAt, Date updatedAt) { }
