package com.study.designpattern._01_creational_patterns._04_builder._03_java;

public class StringBuilderExample {

    public static void main(String[] args) {

        // synchronized를 사용하지 않는 API, StringBuffer는 사용
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("design-pattern study").append("park").toString();
        System.out.println(result);
    }
}
