package com.study.designpattern._03_behavioral_patterns._02_command._01_before;

// Receiver
public class Light {

    private boolean isOn;
    public void on() {
        System.out.println("불을 켭니다.");
        this.isOn = true;
    }
    public void off() {
        System.out.println("불을 끕니다.");
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }
}
