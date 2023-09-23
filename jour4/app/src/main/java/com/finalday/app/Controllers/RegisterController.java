package com.finalday.app.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalday.app.models.UserModel;
import com.finalday.app.models.Dto.RegistrationDTO;
import com.finalday.app.services.AuthService;

@Controller
public class RegisterController {
    
    @Autowired
    private AuthService authService;
    
    @GetMapping("/auth")
    public String register(){
        return "auth";
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody RegistrationDTO body, Model model){
        UserModel userModel = authService.registerUser(body.getUsername(), body.getPassword());
        model.addAttribute("user", userModel);
        return "redirect:/auth"; 
    }
}


