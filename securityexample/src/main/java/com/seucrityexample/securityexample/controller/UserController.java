package com.seucrityexample.securityexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seucrityexample.securityexample.entity.Users1;
import com.seucrityexample.securityexample.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/welcome")
    public String welcomePage(){
        return "Wel come";
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody Users1 user){
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public String userLigin(@RequestBody Users1 user){
System.out.println("UserName : "+ user.getUserName()+" Password : "+user.getUserPassword());

        System.out.println(userService.loadUserByUsername(user.getUserName()));
        return "Login success.....";
        
    }

    @GetMapping("/show/user")
    public List<Users1> getUsers(){
      return userService.getUsers();
        
    }

}
