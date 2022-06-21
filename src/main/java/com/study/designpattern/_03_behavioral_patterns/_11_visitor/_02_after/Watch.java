package com.study.designpattern._03_behavioral_patterns._11_visitor._02_after;

// Concrete Visitor
public class Watch implements Device {
    @Override
    public void print(Circle circle) {
        System.out.println("print circle to watch");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print triangle to watch");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print rectangle to watch");
    }
}
