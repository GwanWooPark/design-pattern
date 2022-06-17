package com.study.designpattern._03_behavioral_patterns._05_mediator._02_after;

import java.time.LocalDateTime;

public class Restaurant {

    private FrontDesk frontDesk;

    public Restaurant(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void dinner(Integer guestId, LocalDateTime dateTime) {
        String roomNumber = this.frontDesk.getRoomNumberFor(guestId);
        System.out.println(roomNumber + " 고객님 식사가 " + dateTime + "에 예약 되었습니다.");
    }
}
