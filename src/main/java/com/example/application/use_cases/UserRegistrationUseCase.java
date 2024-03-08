package com.example.application.use_cases;

import com.example.application.dtos.UserRegistrationRequest;
import com.example.application.dtos.UserResponse;

/**
 * UserRegistrationUseCase defines the input port for the user registration use case,
 * specifying the method for registering a new user with the necessary data.
 */
public interface UserRegistrationUseCase {

    /**
     * Registers a new user in the system using the provided UserRegistrationRequest
     * and returns a UserResponse upon successful registration.
     *
     * @param request the user registration request
     * @return a UserResponse upon successful registration
     */
    UserResponse registerUser(UserRegistrationRequest request);

}