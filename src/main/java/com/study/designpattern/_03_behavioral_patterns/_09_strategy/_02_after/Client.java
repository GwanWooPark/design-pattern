package com.study.designpattern._03_behavioral_patterns._09_strategy._02_after;

public class Client {

    public static void main(String[] args) {
        // 방법 1
//        BlueLightRedLight game = new BlueLightRedLight(new NormalSpeed());
//        game.blueLight();
//        game.redLight();
//
        // 방법 2
        BlueLightRedLight game = new BlueLightRedLight();
        game.blueLight(new Normal());
        game.redLight(new Fastest());

        // 방법 3(익명함수)
        game.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("blue light");
            }

            @Override
            public void redLight() {
                System.out.println("red light");
            }
        });
    }
}
