package com.study.designpattern._02_structual_patterns._01_adapter._02_after.security;

import com.study.designpattern._02_structual_patterns._01_adapter._02_after.AccountService;

public class App {

    public static void main(String[] args) {

        UserDetailsService userDetailsService = new AccountService();
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("park", "park");
        System.out.println(login);
    }
}
