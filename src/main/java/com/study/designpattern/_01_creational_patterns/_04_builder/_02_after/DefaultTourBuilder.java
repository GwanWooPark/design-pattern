package com.study.designpattern._01_creational_patterns._04_builder._02_after;

import com.study.designpattern._01_creational_patterns._04_builder._01_before.DetailPlan;
import com.study.designpattern._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourBuilder implements TourPlanBuilder {

    private String title;
    private int nights;
    private int days;
    private LocalDate startDate;
    private String whereToStay;
    private List<DetailPlan> plans;

    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;

        // Tourbuilder 타입의 DefaultTourBuilder 인스턴스가 반환되고 TourBuilder 타입의 메소드를 계속 해서 사용(chaining)
        return this;
    }

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        this.nights = nights;
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if (this.plans == null) {
            this.plans = new ArrayList<>();
        }

        this.plans.add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return new TourPlan(title, nights, days, startDate, whereToStay, plans);
    }

    @Override
    public void cleanBuilder() {
        this.title = null;
        this.plans = null;
        this.whereToStay = null;
        this.startDate = null;
        this.days = 0;
        this.nights = 0;
    }
}
