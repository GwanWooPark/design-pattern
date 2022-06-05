package com.study.designpattern._01_creational_patterns._04_builder._04_my;

public class App {

    public static void main(String[] args) {

        HouseDirector houseDirector = new HouseDirector(new DefaultHouseBuilder());
        House woodHouse = houseDirector.woodHouse();
        House stoneHouse = houseDirector.stoneHouse();
        System.out.println(woodHouse);
        System.out.println(stoneHouse);
    }
}
