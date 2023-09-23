package com.finalday.app.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalday.app.models.UserModel;
import com.finalday.app.models.Dto.RegistrationDTO;
import com.finalday.app.services.AuthService;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthController {
    
    @Autowired
    private AuthService authService;
    

    @PostMapping("/register")
    public UserModel registerUser(@RequestBody RegistrationDTO body){
        return authService.registerUser(body.getUsername(), body.getPassword());
    }
}


