package com.study.designpattern._02_structual_patterns._07_proxy._04_my;

public class UserLoginProxy implements UserLogin {

    private final UserLogin userLogin;

    public UserLoginProxy(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    @Override
    public void Login(String id) {
        // 서비스의 비즈니스 로직 전후로 내가 원하는 로직을(검증, 캐싱, 로깅 등등)을 구현할 수 있다.
        long before = System.currentTimeMillis();
        System.out.println("Proxy객체가 Id를 검증 중입니다..");
        userLogin.Login(id);
        System.out.println("로그인을 환영합니다");
        System.out.println("로그인 까지 걸린 시간:" + (System.currentTimeMillis() - before));
    }
}
