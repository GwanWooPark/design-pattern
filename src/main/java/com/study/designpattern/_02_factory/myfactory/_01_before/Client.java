package com.study.designpattern._02_factory.myfactory._01_before;

public class Client {

    public static void main(String[] args) {

        Interviewee n_interviewee = Interview.interview("박관우", "pgw4712@icloud.com", "NAVER");
        System.out.println(n_interviewee);

        Interviewee k_interviewee = Interview.interview("박관우", "pgw4712@icloud.com", "KAKAO");
        System.out.println(k_interviewee);
    }
}
