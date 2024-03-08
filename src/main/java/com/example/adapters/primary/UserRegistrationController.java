package com.example.adapters.primary;

import com.example.application.dtos.UserRegistrationRequest;
import com.example.application.dtos.UserResponse;
import com.example.application.services.UserApplicationService;
import com.example.adapters.exceptions.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserRegistrationController {

    private final UserApplicationService userApplicationService;

    @Autowired
    public UserRegistrationController(UserApplicationService userApplicationService) {
        this.userApplicationService = userApplicationService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> registerUser(@RequestBody UserRegistrationRequest registrationRequest) {
        try {
            UserResponse userResponse = userApplicationService.registerUser(registrationRequest);
            return ResponseEntity.ok(userResponse);
        } catch (UserException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
