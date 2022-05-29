package com.study.designpattern.factory._02_after;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = new WhiteshipFactory().orderShip("whiteship", "pgw4712@mail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackshipFactory().orderShip("blackship", "pgw4712@mail.com");
        System.out.println(blackship);

    }
}
