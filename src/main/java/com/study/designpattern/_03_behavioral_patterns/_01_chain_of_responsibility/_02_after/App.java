package com.study.designpattern._03_behavioral_patterns._01_chain_of_responsibility._02_after;

public class App {

    // chain-of-responsibility: 요청에 관련되서 많이 사용됨.
    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));

        // 요청을 보내는 쪽
        Client client = new Client(chain);
        client.doWork();
    }
}
