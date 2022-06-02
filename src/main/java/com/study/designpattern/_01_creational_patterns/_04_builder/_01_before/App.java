package com.study.designpattern._01_creational_patterns._04_builder._01_before;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("을왕리");
        shortTrip.setStartDate(LocalDate.of(2022, 7, 15));

        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("여름 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2022, 8, 20));
        tourPlan.setWhereToStay("펜션");
        tourPlan.addPlan(0, "체크인 이후 짐풀기");
        tourPlan.addPlan(0, "저녁은 회에 소주");
        tourPlan.addPlan(1, "조식은 국밥");
        tourPlan.addPlan(1, "점심까지 쉬기");
        tourPlan.addPlan(1, "점심은 칼국수");
        tourPlan.addPlan(1, "근처 바닷가에서 놀기");
        tourPlan.addPlan(1, "저녁은 고기에 소주");
        tourPlan.addPlan(2, "조식");
        tourPlan.addPlan(2, "체크 아웃");
    }
}
