package com.jour3.jdaexercice.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jour3.jdaexercice.model.PersonEntity;
import com.jour3.jdaexercice.repository.PersonRepository;

@RestController
@RequestMapping("/personne")
public class PersonController{
    
    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }
    
      @GetMapping("/byname/{nom}")
    public Optional<PersonEntity> getPersonByNom(@PathVariable String nom) {
        return personRepository.findByNom(nom);
    }

    @GetMapping("/byage/{age}")
    public List<PersonEntity> getPersonsByAge(@PathVariable int age) {
        return personRepository.findByAge(age);
    }

    @GetMapping("/countbyage/{age}")
    public long countPersonsByAge(@PathVariable int age) {
        return personRepository.countByAge(age);
    }

    @DeleteMapping("/deletebyname/{nom}")
    public void deletePersonByNom(@PathVariable String nom) {
        personRepository.deleteByNom(nom);
    }

    
}