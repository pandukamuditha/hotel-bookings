package dev.panduka.hotel_booking_api.service;

import org.springframework.stereotype.Service;
import dev.panduka.hotel_booking_api.dto.LoginResponse;
import dev.panduka.hotel_booking_api.dto.UserResponse;

@Service
public class AuthService {
    private final UserService userService;

    AuthService(UserService userService) {
        this.userService = userService;
    }

    public LoginResponse login(String username, String password) {
        System.out.printf("AuthService.login(%s, %s)\n", username, password);

        // Check if user exists in the database
        UserResponse userResponse = userService.getUserByUsername(username);
        if (userResponse == null) {
            return null;
        }
        
        return new LoginResponse(userResponse.username(), userResponse.email());
        // Check if the password is correct
        // Generate a JWT token
        // Return LoginResponse
    }
}
