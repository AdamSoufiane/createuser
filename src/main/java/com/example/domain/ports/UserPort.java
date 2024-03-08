package com.example.domain.ports;

import com.example.domain.User;
import java.util.Optional;

/**
 * UserPort defines the contract for user data operations that need to be implemented by the secondary adapter,
 * such as saving the user to the database.
 */
public interface UserPort {

    /**
     * Persists a User entity to the database and returns the saved User instance.
     *
     * @param user the User entity to save
     * @return the saved User instance
     */
    User saveUser(User user);

    /**
     * Retrieves a User entity by its ID if it exists.
     *
     * @param id the ID of the User to find
     * @return an Optional containing the found User or an empty Optional if not found
     */
    Optional<User> findUserById(Long id);

    /**
     * Checks if a User with the given email already exists in the database.
     *
     * @param email the email to check against
     * @return true if a User with the given email exists, false otherwise
     */
    boolean existsByEmail(String email);
}