package com.study.designpattern._03_behavioral_patterns._01_chain_of_responsibility._02_after;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("chain-of-responsibility");
        requestHandler.handle(request);
    }
}
