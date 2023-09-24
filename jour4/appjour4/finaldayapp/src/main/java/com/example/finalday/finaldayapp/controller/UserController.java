package com.example.finalday.finaldayapp.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.finalday.finaldayapp.dto.UserDto;
import com.example.finalday.finaldayapp.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserDetailsService userDetailsService;


    private UserService userService;
    

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home(Model model, Principal principal){
        UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("userdetails", userDetails);
        return "home";
    }

    @GetMapping("/loginpage")
    public String login(Model model, UserDto userDto){
        model.addAttribute("user", userDto);
        return "loginpage";
    }

    @PostMapping("loginpage")
    public String successLogin(){
        return "redirect:/loginpage?success";
    }

    @GetMapping("/register")
    public String register(Model model, UserDto userDto){
        model.addAttribute("user", userDto);
        return "register";
    }

    @PostMapping("/register")
    public String registerSave(@ModelAttribute("user") UserDto userDto){
        userService.save(userDto);
        return "redirect:/register?success";
    }

    @GetMapping("/secret")
    public String secret(){
        return "secret";
    }


}
