package com.study.designpattern._02_factory.myfactory._02_after;

// Product
public interface Interview {


    // Creator
    default Interviewee interview(String name, String email, String company) {

        validate(name, email);
        prepareInterview(company);
        startInterview(company);
        Interviewee interviewee = doInterview();
        sendToEmail(email, interviewee);
        return interviewee;
    }

    private static void sendToEmail(String email, Interviewee interviewee) {
        System.out.println(interviewee.getName() + "님 합격하였습니다.");
    }

    private static void startInterview(String company) {
        System.out.println(company + " 면접 보는중");
    }

    private static void prepareInterview(String company) {
        System.out.println(company + " 면접 준비중");
    }

    private static void validate(String name, String email) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("이름을 입력해주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    // Factory method
    Interviewee doInterview();
}
