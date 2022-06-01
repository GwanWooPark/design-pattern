package com.study.designpattern._01_creational_patterns._02_factory._01_before;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = ShipFactory.orderShip("Whiteship", "pgw4712@mail.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "pgw4712    @mail.com");
        System.out.println(blackship);
    }
}
