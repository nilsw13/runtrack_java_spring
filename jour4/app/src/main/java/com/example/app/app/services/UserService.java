package com.example.app.app.services;

import com.example.app.app.dto.UserDto;
import com.example.app.app.model.User;

public interface UserService {
    
    User save(UserDto UserDto);
}
