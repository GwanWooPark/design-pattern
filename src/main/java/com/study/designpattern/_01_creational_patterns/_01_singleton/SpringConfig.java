package com.study.designpattern._01_creational_patterns._01_singleton;

import org.springframework.context.annotation.Bean;

public class SpringConfig {

    @Bean
    public String hello() {
        return "hello";
    }
}
