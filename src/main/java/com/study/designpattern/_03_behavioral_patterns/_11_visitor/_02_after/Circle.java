package com.study.designpattern._03_behavioral_patterns._11_visitor._02_after;

// Element
public class Circle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
