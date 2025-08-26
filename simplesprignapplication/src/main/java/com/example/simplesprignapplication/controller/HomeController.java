package com.example.simplesprignapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "you are in Home";
    }

    @GetMapping("/about us")
    public String getAboutus(){
        return "About us";
    }
}
