package com.study.designpattern._02_structual_patterns._02_bridge._01_before;

public class KDA베인 implements Champion {

    @Override
    public void move() {
        System.out.println("KDA 베인 move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA 베인 Q");
    }

    @Override
    public void skillW() {
        System.out.println("KDA 베인 W");
    }

    @Override
    public void skillE() {
        System.out.println("KDA 베인 E");
    }

    @Override
    public void skillR() {
        System.out.println("KDA 베인 R");
    }
}
