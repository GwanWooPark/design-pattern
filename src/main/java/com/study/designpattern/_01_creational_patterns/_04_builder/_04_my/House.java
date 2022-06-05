package com.study.designpattern._01_creational_patterns._04_builder._04_my;

public class House {

    private String roof;
    private String window;
    private String door;
    private String type;

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public House() {
    }

    public House(String roof, String window, String door, String type) {
        this.roof = roof;
        this.window = window;
        this.door = door;
        this.type = type;
    }

    @Override
    public String toString() {
        return "House{" +
                "roof='" + roof + '\'' +
                ", window='" + window + '\'' +
                ", door='" + door + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
