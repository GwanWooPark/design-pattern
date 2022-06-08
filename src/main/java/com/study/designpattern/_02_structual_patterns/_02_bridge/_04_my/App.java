package com.study.designpattern._02_structual_patterns._02_bridge._04_my;

public class App {

    public static void main(String[] args) {

        Device macComputer = new Computer(new Mac());
        macComputer.powerOn();
        macComputer.install();
        macComputer.powerOff();

        Device windowPad = new Pad(new Window());
        windowPad.powerOn();
        windowPad.install();
        windowPad.powerOff();
    }
}
