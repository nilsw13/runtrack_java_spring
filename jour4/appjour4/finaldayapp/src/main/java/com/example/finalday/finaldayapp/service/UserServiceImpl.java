package com.example.finalday.finaldayapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.finalday.finaldayapp.dto.UserDto;
import com.example.finalday.finaldayapp.model.User;
import com.example.finalday.finaldayapp.repository.UserRepository;

@Service
public class UserServiceImpl  implements UserService{

    @Autowired
    PasswordEncoder passwordEncoder;

    private UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User save(UserDto userDto) {
        User user = new User(userDto.getUsername(), passwordEncoder.encode(userDto.getPassword()), userDto.getFullname());
        return userRepository.save(user);
    }
    
}
