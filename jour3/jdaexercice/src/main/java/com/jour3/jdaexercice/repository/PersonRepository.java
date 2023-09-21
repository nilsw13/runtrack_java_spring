package com.jour3.jdaexercice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jour3.jdaexercice.entities.PersonEntity;



public interface PersonRepository extends JpaRepository<PersonEntity, Long>{

}
