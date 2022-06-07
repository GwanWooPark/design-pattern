package com.study.designpattern._02_structual_patterns._01_adapter._02_after.security;

// Target Interface
public interface UserDetailsService {
    UserDetails loadUser(String username);
}
