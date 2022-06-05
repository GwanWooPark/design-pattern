package com.study.designpattern._01_creational_patterns._02_factory._02_after;

// Creator
public class WhiteshipFactory implements ShipFactory {

    // ConcreteCreator
    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
