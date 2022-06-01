package com.study.designpattern._02_factory._04_pizza;

public interface PizzaFactory {


    default Pizza orderPizza(String name, String address) {
        preparePizza(name);
        Pizza pizza = makingPizza();
        deliveryPizza(address);
        complete();
        return pizza;
    }

    private void preparePizza(String name) {
        System.out.println(name + " 재료 준비중입니다..");
    }

    private void deliveryPizza(String address) {
        System.out.println(address + "로 피자 배달중 입니다..");
    }

    private void complete() {
        System.out.println("배달완료. 맛있게 드십시오..");
    }


    Pizza makingPizza();
}
