package com.study.designpattern._02_structual_patterns._07_proxy._02_after;

// Real Subject
public class DefaultGameService implements GameService {

    @Override
    public void startGame() {
        System.out.println("게임을 시작합니다.");
    }
}
