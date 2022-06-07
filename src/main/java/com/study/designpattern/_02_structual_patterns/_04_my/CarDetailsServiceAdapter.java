package com.study.designpattern._02_structual_patterns._04_my;

public class CarDetailsServiceAdapter implements CarDetailsService {

    CarService carService;

    public CarDetailsServiceAdapter(CarService carService) {
        this.carService = carService;
    }

    @Override
    public CarDetails loadByType(String type) {
        Car car = carService.findByType(type);
        return new CarDetailsAdapter(car);
    }
}
