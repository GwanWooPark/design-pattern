package com.study.designpattern._01_creational_patterns._02_factory._02_after;

public class BlackshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new Blackhsip();
    }
}
