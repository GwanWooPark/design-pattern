package com.study.designpattern.singleton;

public class Settings {

    private static Settings instance;


    // 1. private로 생성자를 생성하면 클래스가 다르면 생성자를 사용할 수 없다.
    private Settings() {

    }

    // 2. return new 로 했기 때문에 다른 객체로 생성됨
//    public static Settings getInstance() {
//        return new Settings();
//    }

    // 3. 이 방법의 문제(멀티 쓰레드 환경에서 안전하지 못하다)
    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }

        return instance;
    }
}
