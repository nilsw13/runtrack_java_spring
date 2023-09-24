package com.example.app.app.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.app.app.dto.UserDto;
import com.example.app.app.services.UserService;

import org.springframework.ui.Model;

@Controller
public class UserController {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private UserService userService;
    
    @GetMapping("/registration")
    public String getRegistrationPage(@ModelAttribute("user") UserDto userDto){
        return "register";
    }

    @PostMapping("/registration")
    public String saveUser(@ModelAttribute("user") UserDto userDto, Model model){
        userService.save(userDto);
        model.addAttribute("message", "Registered Succesfully");
        return "register";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @GetMapping("/user-page")
    public String userPage(Model model, Principal principal){
        UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("user", userDetails);
        return "user";
    }

    @GetMapping("/admin-page")
    public String adminPage(Model model, Principal principal){
        UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("user", userDetails);
        return "admin";
    }

    @GetMapping("/logout")
    public String logout(){
        return "login";
    }



}
