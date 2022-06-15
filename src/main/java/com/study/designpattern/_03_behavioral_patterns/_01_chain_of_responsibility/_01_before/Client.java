package com.study.designpattern._03_behavioral_patterns._01_chain_of_responsibility._01_before;

public class Client {

    public static void main(String[] args) {
        /*
            패턴을 적용하기 전에 사용자가 Handler를 특정해야 하고, 다중 핸들러 적용이 안되있다.
         */
        Request request = new Request("요청을 보냅니다.");
        RequestHandler requestHandler = new AuthRequestHandler();
        requestHandler.handler(request);
    }
}
