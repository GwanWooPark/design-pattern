package com.study.designpattern._03_behavioral_patterns._08_state._02_after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User park = new User("park");
        User lee = new User("lee");

        chatServer.register("design-pattern", park);
        chatServer.register("design-pattern", lee);
        chatServer.register("observer", park);

        chatServer.sendMessage(park, "design-pattern", "studying..");
        chatServer.sendMessage(lee, "observer", "only");
    }
}
