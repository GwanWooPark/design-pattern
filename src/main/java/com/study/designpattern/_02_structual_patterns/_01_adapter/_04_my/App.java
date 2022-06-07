package com.study.designpattern._02_structual_patterns._01_adapter._04_my;

public class App {

    public static void main(String[] args) {

        CarService carService = new CarService();
        CarDetailsService carDetailsService = new CarDetailsServiceAdapter(carService);
        GasStation gasStation = new GasStation(carDetailsService);

        String gasoline = gasStation.getCharger("gasoline");
        System.out.println(gasoline);

        String electric = gasStation.getCharger("electric");
        System.out.println(electric);

        String diesel = gasStation.getCharger("diesel");
        System.out.println(diesel);


    }
}
