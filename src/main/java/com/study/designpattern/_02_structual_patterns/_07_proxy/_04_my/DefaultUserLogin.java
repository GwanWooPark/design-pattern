package com.study.designpattern._02_structual_patterns._07_proxy._04_my;

public class DefaultUserLogin implements UserLogin {

    @Override
    public void Login(String id) {
        System.out.println(id + "님 로그인 되었습니다.");
    }
}
