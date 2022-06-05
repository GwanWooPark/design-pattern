package com.study.designpattern._01_creational_patterns._04_builder._04_my;

public class DefaultHouseBuilder implements HousePlanBuilder {

    private House house;

    private String roof;
    private String window;
    private String door;
    private String type;

    @Override
    public HousePlanBuilder roof(String roof) {
        this.house.setRoof(roof);
        return this;
    }

    @Override
    public HousePlanBuilder window(String window) {
        this.house.setWindow(window);
        return this;
    }

    @Override
    public HousePlanBuilder door(String door) {
        this.house.setDoor(door);
        return this;
    }

    @Override
    public HousePlanBuilder type(String type) {
        this.house.setType(type);
        return this;
    }

    @Override
    public House getResult() {
        return this.house;
    }
}
