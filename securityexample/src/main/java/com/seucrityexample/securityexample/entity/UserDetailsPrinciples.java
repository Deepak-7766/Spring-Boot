package com.seucrityexample.securityexample.entity;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsPrinciples implements UserDetails {


    private Users1 user;
    public UserDetailsPrinciples(Users1 user){
        this.user=user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword() {
        return user.getUserPassword();
       
    }

    @Override
    public String getUsername() {
        return user.getUserName();
    }

}
