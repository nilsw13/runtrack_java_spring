package com.jour2.ViewExercice.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

public class Message {
    @NotEmpty(message = "ce champ doit etre rempli")
    private String sender;
    @NotEmpty(message = "ce champ doit etre rempli")
    private String Message;
    @NotEmpty(message = "ce champ doit etre rempli")
    private String Mail;
    @Min(value = 18, message = "Vous devez etre majeur pour nous écrire")
    private int Age;


    public Message(String sender, String Mail, String Message,int Age){
        this.sender = sender;
        this.Message = Message;
        this.Mail = Mail;
        this.Age = Age;
        
    }

    public Message(){
    }
    

    public int getAge(){
        return Age;
    }

    public void setAge(int Age){
        this.Age = Age;
    }


    public String getSender() {
        return sender;
    }


    public void setSender(String sender) {
        this.sender = sender;
    }


    public String getMessage() {
        return Message;
    }


    public void setMessage(String message) {
        Message = message;
    }


    public String getMail() {
        return Mail;
    }


    public void setMail(String mail) {
        Mail = mail;
    }





}
