package com.jour3.jdaexercice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import com.jour3.jdaexercice.model.PersonEntity;
import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long>{
     Optional<PersonEntity> findByNom(String nom);  // Cherche par le nom , vide si aucun nom correspond.

     List<PersonEntity> findByAge(int age);   // Cherche toute les personne qui ont un certain age.


     int countByAge(int age); // compte le nombre de personne qui possede un certain age 

     void deleteByNom(String nom); // supprime par le nom





}
