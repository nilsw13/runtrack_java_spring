package com.jour2.ViewExercice.controller;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfilesController {
    
    
    
    @Value("${greeting.message}")
    private String GreetingMessage;

    @GetMapping("/")
    private String envMsg(){
        return GreetingMessage;
    }
}
