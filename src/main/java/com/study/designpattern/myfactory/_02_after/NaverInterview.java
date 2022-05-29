package com.study.designpattern.myfactory._02_after;

public class NaverInterview implements Interview{

    @Override
    public Interviewee doInterview() {
        return new Naver();
    }
}
