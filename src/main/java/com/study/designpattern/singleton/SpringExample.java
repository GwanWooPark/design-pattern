package com.study.designpattern.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {

    public static void main(String[] args) {
        ApplicationContext ap = new AnnotationConfigApplicationContext(SpringConfig.class);
//        singleton scope != singleton pattern 과는 다름(엄밀히 따지면)
//        이거는 ApplicationContext 내부에서 유일한 instance로 관리해주는 것
        String hello = ap.getBean("hello", String.class);
        String hello2 = ap.getBean("hello", String.class);
        System.out.println(hello == hello2);
    }
}
