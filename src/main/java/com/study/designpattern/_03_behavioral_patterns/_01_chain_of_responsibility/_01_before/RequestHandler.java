package com.study.designpattern._03_behavioral_patterns._01_chain_of_responsibility._01_before;

public class RequestHandler {

    private Request request;

    public void handler(Request request) {
        System.out.println(request.getBody());
    }
}
