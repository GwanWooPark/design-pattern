package com.study.designpattern._02_structual_patterns._01_adapter._02_after;

import com.study.designpattern._02_structual_patterns._01_adapter._02_after.security.UserDetailsService;
import com.study.designpattern._02_structual_patterns._01_adapter._02_after.security.UserDetails;

// Adaptee
public class AccountService implements UserDetailsService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

    @Override
    public UserDetails loadUser(String username) {
        return findAccountByUsername(username);
    }
}
