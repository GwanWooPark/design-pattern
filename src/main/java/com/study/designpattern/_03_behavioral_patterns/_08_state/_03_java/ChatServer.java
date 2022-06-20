package com.study.designpattern._03_behavioral_patterns._08_state._03_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Subject
public class ChatServer {

    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void register(String subject, Subscriber subscriber) {
        if (subscribers.containsKey(subject)) {
            subscribers.get(subject).add(subscriber);
        } else {
            List<Subscriber> list = new ArrayList<>();
            list.add(subscriber);
            this.subscribers.put(subject, list);
        }
    }

    public void unregister(String subject, Subscriber subscriber) {
        if (subscribers.containsKey(subject)) {
            subscribers.get(subject).remove(subscriber);
        }
    }
}
