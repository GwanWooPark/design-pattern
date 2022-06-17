package com.study.designpattern._03_behavioral_patterns._05_mediator._02_after;

import java.time.LocalDateTime;

// Mediator
public class FrontDesk {

    private FrontDesk() {

    }
    private static class FrontDeskHolder {
        private static final FrontDesk INSTANCE = new FrontDesk();
    }
    public static FrontDesk getInstance() {
        return FrontDeskHolder.INSTANCE;
    }

    private CleaningService cleaningService = new CleaningService(this);
    private Restaurant restaurant = new Restaurant(this);

    public void getTowers(Guest guest, int numberOfTowers) {
        cleaningService.getTowers(guest.getId(), numberOfTowers);
    }

    public String getRoomNumberFor(Integer guestId) {
        return "1111";
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        restaurant.dinner(guest.getId(), dateTime);
    }
}
