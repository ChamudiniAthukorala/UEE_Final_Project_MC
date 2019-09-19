package com.example.chaulk.mac;

public class Contact {

    String nameContact;
    String emailContactr;
    String phoneContact;
    String contentContact;

    public Contact(String nameContact, String emailContactr, String phoneContact, String contentContact) {
        this.nameContact = nameContact;
        this.emailContactr = emailContactr;
        this.phoneContact = phoneContact;
        this.contentContact = contentContact;
    }


    public String getNameContact() {
        return nameContact;
    }

    public String getEmailContactr() {
        return emailContactr;
    }

    public String getPhoneContact() {
        return phoneContact;
    }

    public String getContentContact() {
        return contentContact;
    }


}
