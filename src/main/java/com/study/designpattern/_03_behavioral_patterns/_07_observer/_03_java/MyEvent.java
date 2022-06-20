package com.study.designpattern._03_behavioral_patterns._07_observer._03_java;

import org.springframework.context.ApplicationEvent;

public class MyEvent {

    private String message;

    public MyEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
