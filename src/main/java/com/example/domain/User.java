package com.example.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * User is the core domain model encapsulating the user attributes and business rules related to user registration.
 * It represents the user with properties like ID, username, email, and password.
 */
@Getter
@Setter
@NoArgsConstructor
public class User {

    /**
     * Unique identifier for the User.
     */
    private Long id;

    /**
     * Username for the User's account.
     */
    private String username;

    /**
     * Email address associated with the User.
     */
    private String email;

    /**
     * Encrypted password for the User's account.
     */
    private String password;

    /**
     * Constructor to instantiate a new User with the provided username, email, and password.
     *
     * @param username the username for the new User
     * @param email    the email address for the new User
     * @param password the encrypted password for the new User
     */
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
