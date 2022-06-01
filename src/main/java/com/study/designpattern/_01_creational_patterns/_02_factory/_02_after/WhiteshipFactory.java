package com.study.designpattern._01_creational_patterns._02_factory._02_after;

// ConcreteProduct
public class WhiteshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
