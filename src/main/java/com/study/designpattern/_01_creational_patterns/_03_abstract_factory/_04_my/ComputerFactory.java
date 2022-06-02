package com.study.designpattern._01_creational_patterns._03_abstract_factory._04_my;

public interface ComputerFactory {

    default Computer orderComputer(String type) {
        prepare(type);
        Computer computer = createComputer();
        end(type);
        return computer;
    }

    Computer createComputer();

    private void prepare(String type) {
        System.out.println(type + " 컴퓨터 파츠 준비중");
    }

    private void end(String type) {
        System.out.println(type + " 생산 완료");
    }
}
