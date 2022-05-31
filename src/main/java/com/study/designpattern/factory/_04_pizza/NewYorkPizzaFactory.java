package com.study.designpattern.factory._04_pizza;

public class NewYorkPizzaFactory implements PizzaFactory {

    @Override
    public NewYorkPizza makingPizza() {
        System.out.println("Newyork Pizza 생성 완료!");
        return new NewYorkPizza();
    }
}
