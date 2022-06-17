package com.study.designpattern._03_behavioral_patterns._05_mediator._02_after;

public class CleaningService {

    private FrontDesk frontDesk;

    public CleaningService(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void getTowers(Integer guestId, int numberOfTowers) {
        String roomNumber = this.frontDesk.getRoomNumberFor(guestId);
        System.out.println("provide " + numberOfTowers + " to " + roomNumber);
    }
}
