package com.study.designpattern._01_creational_patterns._04_builder._02_after;

import com.study.designpattern._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan summerTour() {
        return tourPlanBuilder.title("여름 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2022, 8, 15))
                .whereToStay("펜션")
                .addPlan(0, "1일차")
                .addPlan(1, "2일차")
                .addPlan(2, "3일차")
                .getPlan();
    }

    public TourPlan oneDayTour() {
        return tourPlanBuilder.title("을왕리")
                .startDate(LocalDate.of(2022, 7, 20))
                .getPlan();
    }

    public void cleanBuilder() {
        tourPlanBuilder.cleanBuilder();
    }
}
