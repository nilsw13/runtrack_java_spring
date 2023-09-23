package com.finalday.app.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalday.app.models.UserModel;
import com.finalday.app.models.Dto.RegistrationDTO;
import com.finalday.app.services.AuthService;
import com.finalday.app.services.UserService;

@Controller
public class RegisterController {
    
    @Autowired
    private AuthService authService;
    
    @GetMapping("/auth")
    public String register(Model model, RegistrationDTO userDTO){
        model.addAttribute("user", userDTO);
        return "auth";
    }

    @PostMapping("/register")
    public String registerUser(RegistrationDTO body){
        authService.registerUser(body.getUsername(), body.getPassword());
        return "redirect:/auth"; 
    }
}


