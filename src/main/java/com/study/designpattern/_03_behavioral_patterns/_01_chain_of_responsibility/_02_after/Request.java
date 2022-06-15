package com.study.designpattern._03_behavioral_patterns._01_chain_of_responsibility._02_after;

public class Request {
    private String body;

    public Request(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
