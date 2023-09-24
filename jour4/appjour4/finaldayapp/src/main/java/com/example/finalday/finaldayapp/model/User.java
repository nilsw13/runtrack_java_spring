package com.example.finalday.finaldayapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String password;
    private String fullname;



    public User() {}

    public User(String username, String password, String fullname) {
            super();
            this.username = username;
            this.password = password;
            this.fullname = fullname;
    }






    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


    

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }






    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }





    
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

}
