package com.jour2.ViewExercice.model;


public class Message {
    private String sender;
    private String Message;
    private String Mail;
    private int Age;


    public Message(String sender, String Mail, String Message, int Age){
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

    public void setAge(){
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
