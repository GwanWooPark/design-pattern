package com.study.designpattern.factory.myfactory._02_after;


public class Client {

    public static void main(String[] args) {
        Interviewee kakaoInterview = new KakaoInterview().interview("박관우", "pgw4712@icloud.com", "kakao");
        System.out.println(kakaoInterview);

        Interviewee naverInterviewee = new NaverInterview().interview("박관우", "pgw4712@icloud.com", "naver");
        System.out.println(naverInterviewee);
    }
}
