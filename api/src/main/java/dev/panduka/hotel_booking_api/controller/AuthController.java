package dev.panduka.hotel_booking_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import dev.panduka.hotel_booking_api.dto.LoginRequest;
import dev.panduka.hotel_booking_api.dto.LoginResponse;
import dev.panduka.hotel_booking_api.service.AuthService;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = authService.login(loginRequest.username(), loginRequest.password());

        if (loginResponse == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found", null);
        }

        return loginResponse;
    }
}
