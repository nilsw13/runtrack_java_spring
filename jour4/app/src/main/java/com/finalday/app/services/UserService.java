package com.finalday.app.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.finalday.app.models.Role;
import com.finalday.app.models.UserModel;
import com.finalday.app.repository.UserRepository;

@Service
public class UserService implements UserDetailsService{


    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("in the user details service");

        return userRepository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException("User not valid"));
        
    }

    
    
}
