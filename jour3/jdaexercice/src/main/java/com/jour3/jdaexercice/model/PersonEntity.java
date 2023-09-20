package com.jour3.jdaexercice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Personne")
@Table()
public class PersonEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    public Long getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = id;
    }



    

    @Column(name="Nom", length = 50, nullable=false, unique = false)
    private String nom;
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }









    @Column(name="Age", length = 2, nullable=false, unique = false)
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}
