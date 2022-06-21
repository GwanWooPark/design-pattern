package com.study.designpattern._03_behavioral_patterns._11_visitor._02_after;

// Visitor
public interface Device {
    void print(Circle circle);
    void print(Triangle triangle);
    void print(Rectangle rectangle);
}
