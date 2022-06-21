package com.study.designpattern._03_behavioral_patterns._09_strategy._02_after;

// Context
public class BlueLightRedLight {

    public void blueLight(Speed speed) {
        speed.blueLight();
    }

    public void redLight(Speed speed) {
        speed.redLight();
    }
}
