package com.study.designpattern.factory._04_pizza;

public class ChicagoPizzaFactory implements PizzaFactory {

    @Override
    public ChicagoPizza makingPizza() {
        System.out.println("Chicago Pizza 생성 완료!");
        return new ChicagoPizza();
    }
}
