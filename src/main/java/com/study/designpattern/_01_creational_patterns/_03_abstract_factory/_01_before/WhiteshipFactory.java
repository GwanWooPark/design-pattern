package com.study.designpattern._01_creational_patterns._03_abstract_factory._01_before;

import com.study.designpattern._01_creational_patterns._02_factory._02_after.DefaultShipFactory;
import com.study.designpattern._01_creational_patterns._02_factory._02_after.Ship;
import com.study.designpattern._01_creational_patterns._02_factory._02_after.Whiteship;
import com.study.designpattern._01_creational_patterns._03_abstract_factory._02_after.ShipPartsFactory;

// Client
public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
