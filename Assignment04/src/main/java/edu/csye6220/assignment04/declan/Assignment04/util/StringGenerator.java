package edu.csye6220.assignment04.declan.Assignment04.util;

import org.springframework.stereotype.Component;

import java.util.UUID;


public class StringGenerator {
    public String getRandomString(){
        String msg= UUID.randomUUID().toString();
        return msg;
    }
}
