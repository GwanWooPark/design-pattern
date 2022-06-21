package com.study.designpattern._03_behavioral_patterns._09_strategy._01_before;

public class Client {

    public static void main(String[] args) {

        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(4);
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }
}
