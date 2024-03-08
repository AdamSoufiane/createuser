package com.example.application.services;

import com.example.application.dtos.UserRegistrationRequest;
import com.example.application.dtos.UserResponse;
import com.example.application.use_cases.UserRegistrationUseCase;
import com.example.domain.User;
import com.example.domain.ports.UserPort;
import com.example.adapters.exceptions.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserApplicationService implements UserRegistrationUseCase {

    private final UserPort userPort;

    @Autowired
    public UserApplicationService(UserPort userPort) {
        this.userPort = userPort;
    }

    @Override
    @Transactional
    public UserResponse registerUser(UserRegistrationRequest request) throws UserException {
        if (userPort.existsByEmail(request.getEmail())) {
            throw new UserException("Email already in use.");
        }

        User user = new User(request.getName(), request.getEmail(), request.getPassword());
        User savedUser = userPort.saveUser(user);

        return new UserResponse(savedUser.getId(), savedUser.getUsername(), savedUser.getEmail());
    }
}
