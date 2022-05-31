package com.study.designpattern.factory.myfactory._02_after;

public class NaverInterview implements Interview{

    @Override
    public Interviewee doInterview() {
        return new Naver();
    }
}
