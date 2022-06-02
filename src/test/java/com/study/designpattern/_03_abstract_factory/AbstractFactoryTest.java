package com.study.designpattern._03_abstract_factory;

import com.study.designpattern._01_creational_patterns._03_abstract_factory._04_my.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

    @Test
    @DisplayName("추상 팩토리 테스트")
    public void abstractFactoryTest() {
        ComputerFactory macbookFactory = new MacbookFactory(new MacPartsFactory());
        Computer mac = macbookFactory.orderComputer("맥북");
        System.out.println(mac.getKeyboard().getClass());
        System.out.println(mac.getMouse().getClass());

        System.out.println("----------------------------------------------------------------------------------------------");

        ComputerFactory windowFactory = new WindowFactory(new WindowPartsFactory());
        Computer window = windowFactory.orderComputer("윈도우");
        System.out.println(window.getKeyboard().getClass());
        System.out.println(window.getMouse().getClass());
    }
}
