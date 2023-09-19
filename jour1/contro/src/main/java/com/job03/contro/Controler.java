package com.job03.contro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controler {


    @Value("${greeting.message}")
    private String greetingMessage;


    @GetMapping("/")
    private String getMsg(){
        return greetingMessage;
    }

 

}

