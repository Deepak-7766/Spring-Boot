package com.seucrityexample.securityexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.seucrityexample.securityexample.entity.UserDetailsPrinciples;
import com.seucrityexample.securityexample.entity.Users1;
import com.seucrityexample.securityexample.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    public String registerUser(Users1 user) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
        user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));

        if (userRepository.save(user) != null) {
            return "success";
        }
        return "Regitration failled";
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users1 user = userRepository.findByUserName(username);
        System.out.println(" *");
        System.out.println(" *");
        System.out.println(" ");
        System.out.println(" *");
        System.out.println(user);
        System.out.println(" *");
        System.out.println(" *");
        System.out.println(" *");
        if (user == null) {
            System.out.println("USer Not Found....");
            throw new UsernameNotFoundException("User Does Not Exist or Not Found");
        }

        return new UserDetailsPrinciples(user);
    }

    public List<Users1> getUsers() {
      return userRepository.findAll();
    }

}
