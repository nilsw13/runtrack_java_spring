package com.finalday.app.models.Dto;

public class RegistrationDTO {
    private String username;
    private String password;


    public RegistrationDTO(){
        super();
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

    public String toString(){
        return "Infos enregistrement user: " + "nom :" + this.username + "/n" + "password : " + this.password ;
    }
    
}
