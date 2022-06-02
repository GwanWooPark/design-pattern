package com.study.designpattern._01_creational_patterns._03_abstract_factory._04_my;

public class Computer {

    String type;

    Keyboard keyboard;

    Mouse mouse;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

}
