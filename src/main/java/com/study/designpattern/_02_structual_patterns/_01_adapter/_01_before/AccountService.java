package com.study.designpattern._02_structual_patterns._01_adapter._01_before;

// Adaptee
public class AccountService {

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

}
