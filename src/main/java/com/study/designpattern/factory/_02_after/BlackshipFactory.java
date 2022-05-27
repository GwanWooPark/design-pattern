package com.study.designpattern.factory._02_after;

public class BlackshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new Blackhsip();
    }
}
