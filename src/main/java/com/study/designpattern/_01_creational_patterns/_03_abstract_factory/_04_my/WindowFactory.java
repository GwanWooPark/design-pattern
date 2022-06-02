package com.study.designpattern._01_creational_patterns._03_abstract_factory._04_my;

public class WindowFactory implements ComputerFactory {

    private ComputerPartsFactory computerPartsFactory;

    public WindowFactory(ComputerPartsFactory computerPartsFactory) {
        this.computerPartsFactory = computerPartsFactory;
    }

    @Override
    public Computer createComputer() {
        Computer computer = new Computer();
        computer.setType("윈도우");
        computer.setKeyboard(computerPartsFactory.createKeyboard());
        computer.setMouse(computerPartsFactory.createMouse());
        return computer;
    }
}
