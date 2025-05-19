package org.example.service;

public class UserService {
    public  boolean validateUsername(String username) throws IllegalAccessException {
        if(username == null) throw  new IllegalAccessException("Username is null");
        if(username.length() < 5) return false;
        return  !username.contains(" ");
    }
}
