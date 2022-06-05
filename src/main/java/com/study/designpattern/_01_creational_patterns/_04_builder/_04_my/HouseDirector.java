package com.study.designpattern._01_creational_patterns._04_builder._04_my;

public class HouseDirector {

    private HousePlanBuilder housePlanBuilder;

    public HouseDirector(HousePlanBuilder housePlanBuilder) {
        this.housePlanBuilder = housePlanBuilder;
    }

    public House woodHouse() {
        return housePlanBuilder.roof("나무 지봉")
                .window("나무 창문")
                .door("나무 문")
                .type("나무 집")
                .getResult();
    }

    public House stoneHouse() {
        return housePlanBuilder
                .roof("돌 지붕")
                .window("돌 창문")
                .door("돌 문")
                .type("돌 집")
                .getResult();
    }
}
