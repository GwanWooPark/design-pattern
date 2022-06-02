package com.study.designpattern._01_creational_patterns._04_builder._02_after;

public class App {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());

        System.out.println(director.summerTour());
        director.cleanBuilder();

        System.out.println(director.oneDayTour());
    }
}
