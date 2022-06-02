package com.study.designpattern._01_creational_patterns._03_abstract_factory._04_my;

// Client
public class MacbookFactory implements ComputerFactory {

    private ComputerPartsFactory computerPartsFactory;

    // 추상 인터페이스를 통해 객체를 공급 받음
    public MacbookFactory(ComputerPartsFactory computerPartsFactory) {
        this.computerPartsFactory = computerPartsFactory;
    }

    @Override
    public Computer createComputer() {
        Computer computer = new Computer();
        computer.setType("맥북");
        computer.setKeyboard(computerPartsFactory.createKeyboard());
        computer.setMouse(computerPartsFactory.createMouse());
        return computer;
    }
}
