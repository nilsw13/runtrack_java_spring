package com.jour3.jdaexercice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jour3.jdaexercice.model.PersonEntity;
import com.jour3.jdaexercice.repository.PersonRepository;
@Configuration
public class DataConfigInit {
    
    @Bean
    public CommandLineRunner initData(PersonRepository personRepository){
        return args -> {
            PersonEntity personne1 = new PersonEntity();
            PersonEntity personne2 = new PersonEntity();
            PersonEntity personne3 = new PersonEntity();
            PersonEntity personne4 = new PersonEntity();
            PersonEntity personne5 = new PersonEntity();
            personne1.setId(1);
            personne2.setId(2);
            personne3.setId(3);
            personne4.setId(4);
            personne5.setId(5);

            personne1.setNom("Sarah");
            personne2.setNom("Marie");
            personne3.setNom("Louis");
            personne4.setNom("Thomas");
            personne5.setNom("Paul");

            personne1.setAge(44);
            personne2.setAge(26);
            personne3.setAge(65);
            personne4.setAge(15);
            personne5.setAge(7);

            personRepository.save(personne1);
            personRepository.save(personne2);
            personRepository.save(personne3);
            personRepository.save(personne4);
            personRepository.save(personne5);
            
        };
    }
}
