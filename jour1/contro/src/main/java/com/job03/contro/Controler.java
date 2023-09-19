package com.job03.contro;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

    @GetMapping("/")
    public String hello(@RequestParam(value = "name", defaultValue = "world") String name){
        name = "Nils";
        Date now = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formated = s.format(now);
        int a = 5;
        int b = 5;
        int result = a + b;
        return String.format("hello %s %s resultat : %s", name, formated, result);
    }

 

}

