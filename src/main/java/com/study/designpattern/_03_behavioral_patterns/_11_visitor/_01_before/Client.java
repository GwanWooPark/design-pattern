package com.study.designpattern._03_behavioral_patterns._11_visitor._01_before;

public class Client {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        rectangle.printTo(new Phone());
        triangle.printTo(new Watch());
    }
}
