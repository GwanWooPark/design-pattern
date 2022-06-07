package com.study.designpattern._02_structual_patterns._04_my;

public class CarService {

    public Car findByType(String type) {
        Car car = new Car();
        car.setType(type);
        return car;
    }
}
