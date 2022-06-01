package com.study.designpattern._02_factory._04_pizza;

public class Client {

    public static void main(String[] args) {

        Pizza chicagoPizza = new ChicagoPizzaFactory().orderPizza("시카고 피자", "청능대로 175");
        System.out.println(chicagoPizza);

        Pizza newYorkPizza = new NewYorkPizzaFactory().orderPizza("뉴욕 피자", "청능대로 175");
        System.out.println(newYorkPizza);
    }

}
