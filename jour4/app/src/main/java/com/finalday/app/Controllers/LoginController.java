package com.finalday.app.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.finalday.app.models.Dto.RegistrationDTO;

@Controller
public class LoginController {
    
@GetMapping("/login")
public String login(Model model, RegistrationDTO userDTO){
    model.addAttribute("user", userDTO);
    return "login";
}

}
