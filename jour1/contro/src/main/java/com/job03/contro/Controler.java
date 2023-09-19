package com.job03.contro;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

    
    


    @Value("${greeting.message}")
    private String greetingMessage;


    @GetMapping("/")
    public String hello(@RequestParam(value = "name", defaultValue = "world") String name){
        
        name = "Nils";
        Date now = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM: HH:mm:ss");
        String formated = s.format(now);
        int a = 5;
        int b = 5;
        int result = a + b;
        return String.format("hello %s, nous somme le %s et voici le resultat du calcul que tu ma demandé (%s + %s) : %s", name, now,a,b, result );
    }

 

}

