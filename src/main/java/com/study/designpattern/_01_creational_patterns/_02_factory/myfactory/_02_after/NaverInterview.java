package com.study.designpattern._01_creational_patterns._02_factory.myfactory._02_after;

public class NaverInterview implements Interview{

    @Override
    public Interviewee doInterview() {
        return new Naver();
    }
}
