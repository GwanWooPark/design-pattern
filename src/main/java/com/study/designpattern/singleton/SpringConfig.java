package com.study.designpattern.singleton;

import org.springframework.context.annotation.Bean;

public class SpringConfig {

    @Bean
    public String hello() {
        return "hello";
    }
}
