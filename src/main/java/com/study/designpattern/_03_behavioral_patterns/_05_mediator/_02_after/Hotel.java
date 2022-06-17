package com.study.designpattern._03_behavioral_patterns._05_mediator._02_after;

import java.time.LocalDateTime;

public class Hotel {

    public static void main(String[] args) {

        Guest guest1 = new Guest();
        Guest guest2 = new Guest();
        guest1.setId(1);
        guest2.setId(2);
        guest1.getTowers(3);
        guest2.dinner(LocalDateTime.now());
    }
}
