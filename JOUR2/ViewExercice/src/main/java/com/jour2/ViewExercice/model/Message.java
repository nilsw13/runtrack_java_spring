package com.jour2.ViewExercice.model;


public class Message {
    private String sender;
    private String Message;
    private String Mail;


    public Message(String sender, String Mail, String Message){
        this.sender = sender;
        this.Message = Message;
        this.Mail = Mail;
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
