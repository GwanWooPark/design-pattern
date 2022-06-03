package com.study.designpattern._01_creational_patterns._04_builder._02_after;

import com.study.designpattern._01_creational_patterns._04_builder._01_before.DetailPlan;
import com.study.designpattern._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourBuilder implements TourPlanBuilder {

    private TourPlan tourPlan;

    @Override
    public TourPlanBuilder newInstance() {
        this.tourPlan = new TourPlan();
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        this.tourPlan.setTitle(title);
        // Tourbuilder 타입의 DefaultTourBuilder 인스턴스가 반환되고 TourBuilder 타입의 메소드를 계속 해서 사용(chaining)
        return this;
    }

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        this.tourPlan.setDays(days);
        this.tourPlan.setNights(nights);
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.tourPlan.setStartDate(startDate);
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.tourPlan.setWhereToStay(whereToStay);
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if (this.tourPlan.getPlans() == null) {
            this.tourPlan.setPlans(new ArrayList<>());
        }

        this.tourPlan.addPlan(day, plan);
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return this.tourPlan;
    }

    @Override
    public void cleanBuilder() {
        this.tourPlan.setTitle(null);
        this.tourPlan.setPlans(null);
        this.tourPlan.setWhereToStay(null);
        this.tourPlan.setStartDate(null);
        this.tourPlan.setDays(0);
        this.tourPlan.setNights(0);
    }
}
