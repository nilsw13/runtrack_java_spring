package com.jour2.ViewExercice.controller;
import com.jour2.ViewExercice.model.Message;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class ViewController {
    private List<Message> msgList = new ArrayList<>();
    
    @GetMapping("/msg")
    public String showMessage(Model model){
       Message msg1 = new Message("nils", "nils.wenting@laplateforme.io", "Voici mon Message");
       Message msg2 = new Message("Ouss", "Ouss21@gmail.com", "Ceci est un autre test");
       msgList.add(msg1);
       msgList.add(msg2);
       model.addAttribute("msgList", msg2);

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

