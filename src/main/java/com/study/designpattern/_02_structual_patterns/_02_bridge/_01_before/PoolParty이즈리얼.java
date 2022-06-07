package com.study.designpattern._02_structual_patterns._02_bridge._01_before;

public class PoolParty이즈리얼 implements Champion {

    @Override
    public void move() {
        System.out.println("PoolParty 이즈리얼 move");
    }

    @Override
    public void skillQ() {
        System.out.println("PoolParty 이즈리얼 Q");
    }

    @Override
    public void skillW() {
        System.out.println("PoolParty 이즈리얼 W");
    }

    @Override
    public void skillE() {
        System.out.println("PoolParty 이즈리얼 E");
    }

    @Override
    public void skillR() {
        System.out.println("PoolParty 이즈리얼 R");
    }
}
