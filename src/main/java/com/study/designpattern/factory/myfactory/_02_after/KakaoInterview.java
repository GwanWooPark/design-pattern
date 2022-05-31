package com.study.designpattern.factory.myfactory._02_after;

// ConcreteProduct
public class KakaoInterview implements Interview {


    @Override
    public Interviewee doInterview() {
        return new Kakao();
    }
}
