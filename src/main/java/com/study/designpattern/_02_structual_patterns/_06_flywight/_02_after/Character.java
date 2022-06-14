package com.study.designpattern._02_structual_patterns._06_flywight._02_after;

// extrinsic
public class Character {

    char value;
    String color;
    Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
