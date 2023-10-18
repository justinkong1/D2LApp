package com.example.d2lapp;

import android.app.Application;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class database implements Serializable {
    public static List<user> users = new ArrayList<>();

    database me() {
        return this;
    }

    void addUser(user user) {
        users.add(user);
    }
    void addUser(String email,String us, String pass) {
        user u = new user(email,us,pass);
        addUser(u);
    }

    boolean hasEmail(String email) {
        for(user u : users) {
            if(u.email.equals(email)) return true;
        }
        return false;
    }

    user getUserFromEmail(String email) {
        for(user u : users) {
            if(u.email.equals(email)) return u;
        }
        return null;
    }

}
