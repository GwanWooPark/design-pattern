package com.study.designpattern._02_structual_patterns._01_before.security;

// Target
public interface UserDetailsService {
    UserDetails loadUser(String username);
}
