package com.jour2.ViewExercice.controller;
import com.jour2.ViewExercice.model.Message;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

@Controller
public class MessageController {
    private List<Message> msgList = new ArrayList<>();

    


    @GetMapping("/msg")
    public String showMessage(Model model){ 
       model.addAttribute("WelcomeMessage", "Bienvenu sur le formulaire");
       model.addAttribute("newMessage", new Message());
       model.addAttribute("msgList", msgList);
       model.addAttribute("newAge", model);
       
       return "msgPage";

        };


    @PostMapping("/msg")
    public String postedMessage(@Valid @ModelAttribute Message newMessage, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()) {
            return "error";

        }else {

            model.addAttribute("successMessage", "Le formulaire a été soumis avec succès!");
            msgList.add(newMessage);
            System.out.println("postedMessage method called!");
            System.out.println(model.getAttribute("successMessage"));

        return "redirect:msg";
        }

        
    }
    
    
    

    }











    /*@Value("${greeting.message}")
    String GreetingMessage;

    @GetMapping("/")
    String getMsg(Model model){
        model.addAttribute("message", "hello world");
        return "Home" + GreetingMessage;
    }*/

