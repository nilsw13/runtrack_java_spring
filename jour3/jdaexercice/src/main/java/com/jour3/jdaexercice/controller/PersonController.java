package com.jour3.jdaexercice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jour3.jdaexercice.entities.PersonEntity;
import com.jour3.jdaexercice.repository.PersonRepository;
import com.jour3.jdaexercice.service.PersonService;

@Controller
public class PersonController{

    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }


    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/person-list")
    public String findAllPerson(Model model){
        List<PersonEntity> person = personService.showAllPerson();
        model.addAttribute("person", person);
        return "person-list";
    }

    @PostMapping("/add")
    public String addNewPerson(@RequestParam String name, @RequestParam Integer age){
        PersonEntity person = new PersonEntity();
        person.setName(name);
        person.setAge(age);

        personService.addNewPerson(person);

        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deletePerson(@PathVariable Long id){
        personService.deletePerson(id);
        return "redirect:/person-list";
    }

   
}