package com.study.designpattern._01_creational_patterns._02_factory.myfactory._02_after;

// ConcreteProduct
public class KakaoInterview implements Interview {


    @Override
    public Interviewee doInterview() {
        return new Kakao();
    }
}
