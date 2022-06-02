package com.study.designpattern._01_creational_patterns._03_abstract_factory._04_my;

// Abstract Factory
public interface ComputerPartsFactory {

    Keyboard createKeyboard();
    Mouse createMouse();
}
