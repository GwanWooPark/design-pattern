package com.study.designpattern._02_structual_patterns._04_my;

// Client
public class GasStation {

    CarDetailsService carDetailsService;

    public GasStation(CarDetailsService carDetailsService) {
        this.carDetailsService = carDetailsService;
    }

    public String getCharger(String type) {
        CarDetails carDetails = carDetailsService.loadByType(type);

        if (carDetails.getType().equals("electric")) {
            return "전기차 호스 반환";
        } else if (carDetails.getType().equals("diesel")) {
            return "경유차 호스 반환";
        } else if (carDetails.getType().equals("gasoline")) {
            return "휘발유차 호스 반환";
        } else {
            throw new IllegalArgumentException("맞는 호스가 없습니다.");
        }
    }
}
