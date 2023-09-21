package com.jour3.jdaexercice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jour3.jdaexercice.entities.PersonEntity;
import com.jour3.jdaexercice.repository.PersonRepository;

@Controller
public class PersonController{
    @Autowired
    PersonRepository monInterface;

    public void addPerson(){
        PersonEntity person1 = new PersonEntity("Nils", 27);
        PersonEntity person2 = new PersonEntity("Ouss", 26);
        PersonEntity person3 = new PersonEntity("Young", 28);
        monInterface.save(person1);
        monInterface.save(person2);
        monInterface.save(person3);
    }

    @GetMapping("/person-list")
    public String findAll(Model model){
        addPerson();
        List<PersonEntity> PersonList = monInterface.findAll();
        model.addAttribute("PersonList", PersonList);
        return "person-list";
    }
}