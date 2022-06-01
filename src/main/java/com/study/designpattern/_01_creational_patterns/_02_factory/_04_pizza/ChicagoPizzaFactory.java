package com.study.designpattern._01_creational_patterns._02_factory._04_pizza;

public class ChicagoPizzaFactory implements PizzaFactory {

    @Override
    public ChicagoPizza makingPizza() {
        System.out.println("Chicago Pizza 생성 완료!");
        return new ChicagoPizza();
    }
}
