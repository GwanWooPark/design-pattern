package com.study.designpattern._01_creational_patterns._04_builder._04_my;

public class DefaultHouseBuilder implements HousePlanBuilder {

    private House house;

    private String roof;
    private String window;
    private String door;
    private String type;

    @Override
    public HousePlanBuilder roof(String roof) {
        this.roof = roof;
        return this;
    }

    @Override
    public HousePlanBuilder window(String window) {
        this.window = window;
        return this;
    }

    @Override
    public HousePlanBuilder door(String door) {
        this.door = door;
        return this;
    }

    @Override
    public HousePlanBuilder type(String type) {
        this.type = type;
        return this;
    }

    @Override
    public House getResult() {
        return new House(roof, window, door, type);
    }
}
