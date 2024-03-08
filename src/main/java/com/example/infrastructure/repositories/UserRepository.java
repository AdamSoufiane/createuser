package com.example.infrastructure.repositories;

import com.example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/**
 * UserRepository is the secondary adapter that implements the UserPort for data persistence.
 * It uses Spring Data JPA to interact with the Postgres database and perform user-related operations.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Method to find a user by email. It returns an Optional containing the user if found, or an empty Optional otherwise.
     *
     * @param email the email address to search for
     * @return an Optional containing the found User or an empty Optional if no user is found
     */
    Optional<User> findByEmail(String email);
}
