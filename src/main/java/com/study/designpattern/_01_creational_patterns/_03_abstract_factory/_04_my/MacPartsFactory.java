package com.study.designpattern._01_creational_patterns._03_abstract_factory._04_my;

// Concrete Factory
public class MacPartsFactory implements ComputerPartsFactory {

    @Override
    public Keyboard createKeyboard() {
        return new MacKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new MacMouse();
    }
}
