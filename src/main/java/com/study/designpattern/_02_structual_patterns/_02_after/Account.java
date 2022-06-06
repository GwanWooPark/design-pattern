package com.study.designpattern._02_structual_patterns._02_after;

import com.study.designpattern._02_structual_patterns._02_after.security.UserDetails;

// Adaptee
public class Account implements UserDetails {

    private String username;
    private String password;
    private String email;

    @Override
    public String getUsername() {
        return this.username;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
