package com.study.designpattern._02_structual_patterns._04_decorator._04_my;

import java.util.ArrayList;
import java.util.List;

public class App {

    private static boolean isMouseChecked = true;
    private static boolean isKeyboardChecked = true;

    public static void main(String[] args) {

        OptionService optionService = new DefaultOptionService();
        List<String> options = new ArrayList<>();
        options.add("키보드");
        options.add("마우스");

        if (isKeyboardChecked) {
            optionService = new AddKeyboardOptionDecorator(optionService);
        }

        if (isMouseChecked) {
            optionService = new AddMouseOptionDecorator(optionService);
        }

        Client client = new Client(optionService);
        client.writeResult(options);
    }
}
