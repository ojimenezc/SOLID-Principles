package com.example.com.no_compliant_examples.single_responsibility;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class User {

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = this.encryptPassword(password);
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

    private String encryptPassword(String clearValue) {
        //TODO: For saving password neve user Base64 encoding. This is for demo purposes
        return Base64.getEncoder().encodeToString(clearValue.getBytes(StandardCharsets.UTF_8));
    }

    private String decryptPassword(String encodedValue) {
        //TODO: For saving password neve user Base64 encoding. This is for demo purposes
        return Base64.getEncoder().encodeToString(encodedValue.getBytes(StandardCharsets.UTF_8));
    }
}
