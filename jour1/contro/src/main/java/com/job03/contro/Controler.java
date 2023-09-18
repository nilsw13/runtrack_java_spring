package com.job03.contro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }

}
