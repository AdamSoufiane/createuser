package com.example.application.dtos;

import lombok.Getter;

/**
 * UserRegistrationRequest is a data transfer object used to carry user data from the primary adapter to the application layer,
 * containing fields such as name, email, and password.
 */
@Getter
public class UserRegistrationRequest {

    private final String name;
    private final String email;
    private final String password;

    /**
     * Constructs a new UserRegistrationRequest with the specified user details.
     * @param name The name of the user to be registered.
     * @param email The email of the user, used as a unique identifier for login purposes.
     * @param password The password for the user account, which will be encrypted before storage.
     */
    public UserRegistrationRequest(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
