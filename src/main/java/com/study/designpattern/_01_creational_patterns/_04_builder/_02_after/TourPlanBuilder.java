package com.study.designpattern._01_creational_patterns._04_builder._02_after;

import com.study.designpattern._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {

    TourPlanBuilder newInstance();

    // TourPlanBuilder을 반환형으로 사용하는 이유: Builder를 통한 method chaining
    TourPlanBuilder title(String title);

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();

    void cleanBuilder();
}
