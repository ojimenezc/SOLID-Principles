package com.example.com.compliant_examples.single_responsibility;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Encrypter {

    public static String encrypt(String plainValue){
        return Base64.getEncoder().encodeToString(plainValue.getBytes(StandardCharsets.UTF_8));
    }
}
