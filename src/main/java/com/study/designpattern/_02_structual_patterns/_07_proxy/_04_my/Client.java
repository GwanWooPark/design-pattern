package com.study.designpattern._02_structual_patterns._07_proxy._04_my;

public class Client {

    public static void main(String[] args) {

        UserLoginProxy loginProxy = new UserLoginProxy(new DefaultUserLogin());
        loginProxy.Login("pgw4712");
    }
}
