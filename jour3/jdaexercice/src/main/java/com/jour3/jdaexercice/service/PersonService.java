package com.jour3.jdaexercice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jour3.jdaexercice.entities.PersonEntity;
import com.jour3.jdaexercice.repository.PersonRepository;
@Service
public class PersonService {
    @Autowired 
    private PersonRepository personRepository;
    public void addNewPerson(PersonEntity personEntity){
        personRepository.save(personEntity);
    }
    public void deletePerson(Long id){
        personRepository.deleteById(id);
    }
    public List<PersonEntity> showAllPerson(){
        return personRepository.findAll();
    }
    public Object findAll() {
        return null;
    }
}
