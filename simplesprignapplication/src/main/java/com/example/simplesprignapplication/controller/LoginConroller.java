package com.example.simplesprignapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginConroller {
    
    @GetMapping("/login")
    public String getLogin(){
        return "You are in Login";

    }


}
