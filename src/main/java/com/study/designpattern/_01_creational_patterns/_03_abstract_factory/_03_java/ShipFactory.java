package com.study.designpattern._01_creational_patterns._03_abstract_factory._03_java;

import com.study.designpattern._01_creational_patterns._02_factory._02_after.Ship;
import com.study.designpattern._01_creational_patterns._02_factory._02_after.Whiteship;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new Whiteship();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
