package com.study.designpattern._03_behavioral_patterns._01_chain_of_responsibility._02_after;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("chain-of-responsibility 로깅 Handler");
        super.handle(request);
    }
}
