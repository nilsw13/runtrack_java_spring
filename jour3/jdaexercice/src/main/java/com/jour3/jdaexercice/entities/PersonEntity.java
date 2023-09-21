package com.jour3.jdaexercice.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class PersonEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    public String name;
    public Integer age;

    public PersonEntity(String name, Integer age){
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public Integer getAge() {
        return age;
    }



    
    
}
