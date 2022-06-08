package com.study.designpattern._02_structual_patterns._02_bridge._04_my;

// Refined Abstraction
public class DefaultDevice implements Device {

    private OS os;
    private String name;

    public DefaultDevice(OS os, String name) {
        this.os = os;
        this.name = name;
    }

    @Override
    public void powerOn() {
        System.out.printf("%s %s 부팅 중 ..\n", os.getOS(), this.name);
    }

    @Override
    public void powerOff() {
        System.out.printf("%s %s 종료 중 ..\n", os.getOS(), this.name);
    }

    @Override
    public void install() {
        System.out.printf("%s %s에 맞는 확장자로 설치 중 ..\n", os.getOS(), this.name);
    }
}
