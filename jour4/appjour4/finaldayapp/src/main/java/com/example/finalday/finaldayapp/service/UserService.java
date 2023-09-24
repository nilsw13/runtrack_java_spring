package com.example.finalday.finaldayapp.service;

import com.example.finalday.finaldayapp.dto.UserDto;
import com.example.finalday.finaldayapp.model.User;

public interface UserService {
    User findByUsername(String username);
    User save(UserDto userDto);
}
