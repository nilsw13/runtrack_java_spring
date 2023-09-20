package com.jour2.ViewExercice.controller;
import com.jour2.ViewExercice.model.Message;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IterationController {
    private List<Message> msgList = new ArrayList<>();

    @GetMapping("/view")
    public String showMessage(Model model){
       Message msg1 = new Message("nils", "nils.wenting@laplateforme.io", "Voici mon Message", 28);
       Message msg2 = new Message("Ouss", "Ouss21@gmail.com", "Ceci est un autre test", 27);
       msgList.add(msg1);
       msgList.add(msg2);
       model.addAttribute("msgList", msgList);
       return "view";

}
}
