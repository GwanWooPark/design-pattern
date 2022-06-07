package com.study.designpattern._02_structual_patterns._01_adapter._04_my;

public class CarDetailsAdapter implements CarDetails {

    private Car car;

    public CarDetailsAdapter(Car car) {
        this.car = car;
    }

    @Override
    public String getType() {
        return this.car.getType();
    }
}
