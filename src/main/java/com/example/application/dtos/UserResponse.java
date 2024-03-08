package com.example.application.dtos;

import lombok.Value;

@Value
public class UserResponse {
    Long id;
    String name;
    String email;
}
