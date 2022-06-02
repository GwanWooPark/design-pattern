package com.study.designpattern._01_creational_patterns._03_abstract_factory._04_my;

public class WindowPartsFactory implements ComputerPartsFactory {

    @Override
    public Keyboard createKeyboard() {
        return new WindowKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new WindowMouse();
    }
}
