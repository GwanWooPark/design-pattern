package com.study.designpattern._01_creational_patterns._03_abstract_factory._02_after;

import com.study.designpattern._01_creational_patterns._02_factory._02_after.Ship;
import com.study.designpattern._01_creational_patterns._02_factory._02_after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());

        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

    }
}
