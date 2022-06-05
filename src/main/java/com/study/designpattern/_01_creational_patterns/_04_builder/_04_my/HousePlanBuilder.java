package com.study.designpattern._01_creational_patterns._04_builder._04_my;

public interface HousePlanBuilder {

    HousePlanBuilder roof(String roof);
    HousePlanBuilder window(String window);
    HousePlanBuilder door(String door);
    HousePlanBuilder type(String type);

    House getResult();
}
