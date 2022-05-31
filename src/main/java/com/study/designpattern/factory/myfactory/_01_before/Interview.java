package com.study.designpattern.factory.myfactory._01_before;

public class Interview {

    public static Interviewee interview(String name, String email, String company) {

        prepareInterview();

        // validate
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("이름을 입력해주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }

        Interviewee interviewee = new Interviewee();
        interviewee.setName(name);
        interviewee.setCompany(company);

        // Set company
        if (company.equalsIgnoreCase("naver")) {
            interviewee.setResume("Naver에 입사하고 싶습니다");
        } else if (company.equalsIgnoreCase("kakao")) {
            interviewee.setResume("Kakao에 입사하고 싶습니다");
        }

        startInterview();

        // Interview answer
        if (company.equalsIgnoreCase("naver")) {
            interviewee.setAnswer("Naver에서 열심히 하겠습니다.");
        } else if (company.equalsIgnoreCase("kakao")) {
            interviewee.setAnswer("Kakao에서 열심히 하겠습니다.");
        }

        // Notify
        sendToEmail(email, interviewee);

        return interviewee;
    }

    private static void sendToEmail(String email, Interviewee interviewee) {
        System.out.println(interviewee.getName() + "님 합격하였습니다.");
    }

    private static void startInterview() {
        System.out.println("면접 보는중");
    }

    private static void prepareInterview() {
        System.out.println("면접 준비중");
    }


}
