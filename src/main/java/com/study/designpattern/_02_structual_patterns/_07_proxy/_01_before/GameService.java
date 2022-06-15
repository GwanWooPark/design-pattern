package com.study.designpattern._02_structual_patterns._07_proxy._01_before;

public class GameService {
    public void startGame() throws InterruptedException {
        System.out.println("게임을 시작합니다.");
        Thread.sleep(1000L);
    }
}
