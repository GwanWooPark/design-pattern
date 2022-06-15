package com.study.designpattern._02_structual_patterns._07_proxy._03_java;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// spring에 등록된 bean만 적용 가능, Aspect도 bean으로 등록되어야함
@Aspect
@Component
public class PerfAspect {

    // Around: 어디에 적용 할지
    @Around("bean(gameService)")
    public void timestamp(ProceedingJoinPoint point) throws Throwable {
        long before = System.currentTimeMillis();
        point.proceed();
        System.out.println(System.currentTimeMillis() - before);
    }
}
