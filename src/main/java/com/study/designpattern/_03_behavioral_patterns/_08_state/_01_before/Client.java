package com.study.designpattern._03_behavioral_patterns._08_state._01_before;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User park = new User(chatServer);
        park.sendMessage("디자인 패턴", "행동 패턴");
        park.sendMessage("2022", "06.20");

        User lee = new User(chatServer);
        System.out.println(lee.getMessage("디자인 패턴"));

        park.sendMessage("디자인 패턴", "옵저버 패턴");
        System.out.println(lee.getMessage("디자인 패턴"));


    }
}
