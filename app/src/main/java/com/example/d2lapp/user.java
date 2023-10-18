package com.example.d2lapp;

import java.io.Serializable;

public class user implements Serializable {
    String name;
    String pass;
    String email;
    public user(String email,String name,String pass) {
        this.email = email;
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
}
