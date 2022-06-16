package com.study.designpattern._03_behavioral_patterns._02_command._03_java;

import com.study.designpattern._03_behavioral_patterns._02_command._02_after.Game;
import com.study.designpattern._03_behavioral_patterns._02_command._02_after.Light;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommandInJava {

    public static void main(String[] args) {
        Light light = new Light();
        Game game = new Game();
        // Thread Pool을 만들어주는 일종의 팩토리
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // 메서드 레퍼런스(자바 8 이상부터)
        executorService.submit(light::on);
        executorService.submit(game::start);
        executorService.submit(game::end);
        executorService.submit(light::off);
        executorService.shutdown();
    }
}
