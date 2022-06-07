package com.study.designpattern._02_structual_patterns._02_bridge._02_after;

public class App {

    public static void main(String[] args) {
        Champion kda베인 = new 베인(new KDA());
        kda베인.skillQ();
        kda베인.skillW();

        Champion poolParty이즈리얼 = new 이즈리얼(new PoolParty());
        poolParty이즈리얼.skillR();
        poolParty이즈리얼.skillQ();
    }
}
