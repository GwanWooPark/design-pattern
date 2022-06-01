package com.study.designpattern._02_factory._02_after;

// ConcreteProduct
public class WhiteshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
