package com.example.app.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.app.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail (String email);
}
