package com.jour2.ViewExercice.controller;
import com.jour2.ViewExercice.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class ViewController {
    private List<Message> msgList = new ArrayList<>();

    @PostMapping("/msg")
    public String postedMessage(@ModelAttribute Message newMessage){
        msgList.add(newMessage);
        return "redirect:msg";
    }
    
    @GetMapping("/msg")
    public String showMessage(Model model){
       model.addAttribute("msgList", msgList);
       model.addAttribute("newMessage", new Message());

       return "msgPage";

        };

    }











    /*@Value("${greeting.message}")
    String GreetingMessage;

    @GetMapping("/")
    String getMsg(Model model){
        model.addAttribute("message", "hello world");
        return "Home" + GreetingMessage;
    }*/

