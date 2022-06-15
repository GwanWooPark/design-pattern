package com.study.designpattern._02_structual_patterns._07_proxy._03_java;

import org.springframework.stereotype.Service;

@Service
public class GameService {

    public void startGame() {
        System.out.println("게임을 시작합니다.");
    }
}
