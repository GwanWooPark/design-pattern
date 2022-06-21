package com.study.designpattern._03_behavioral_patterns._11_visitor._02_after;

public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device phone = new Phone();

        // 구체적인 타입을 찾아가는 데 2번이 소요됨(Double Dispatch)
        // 1. rectangle(Shape) type
        // 2. phone(Device) type
        rectangle.accept(phone);
    }
}
