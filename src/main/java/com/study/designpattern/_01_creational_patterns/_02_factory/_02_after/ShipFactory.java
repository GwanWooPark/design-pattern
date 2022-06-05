package com.study.designpattern._01_creational_patterns._02_factory._02_after;

// Creator
public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    // factory method
    Ship createShip();
    private void validate(String name, String email) {
        // validate
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요. ");
        }
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만드는 중");
    }
    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 제작 완료");
    }
}
