package com.study.designpattern._03_behavioral_patterns._01_chain_of_responsibility._02_after;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("chain-of-responsibility 인증 확인 Handler");
        super.handle(request);
    }
}
