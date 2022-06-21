package com.study.designpattern._03_behavioral_patterns._11_visitor._02_after;

public class Computer implements Device {

    @Override
    public void print(Circle circle) {
        System.out.println("print circle to pad");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print triangle to pad");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print rectangle to pad");
    }
}
