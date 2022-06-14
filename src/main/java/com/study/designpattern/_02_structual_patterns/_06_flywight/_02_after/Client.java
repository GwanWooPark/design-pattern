package com.study.designpattern._02_structual_patterns._06_flywight._02_after;

public class Client {

    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        // fontFactory가 공유하는 인스턴스이기 때문에 그만큼의 메모리를 덜 쓰게됨
        Character c1 = new Character('h', "skyblue", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('h', "skyblue", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('h', "skyblue", fontFactory.getFont("nanum:12"));
    }
}
