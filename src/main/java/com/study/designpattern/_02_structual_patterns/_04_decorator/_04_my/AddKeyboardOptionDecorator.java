package com.study.designpattern._02_structual_patterns._04_decorator._04_my;

import java.util.List;

// Concrete Decorator
public class AddKeyboardOptionDecorator extends OptionDecorator {

    public AddKeyboardOptionDecorator(OptionService optionService) {
        super(optionService);
    }

    @Override
    public void addOption(List<String> options) {
        if (isChecked(options)) {
            System.out.println("키보드 추가 완료");
        }
        super.addOption(options);
    }

    private boolean isChecked(List<String> options) {
        return options.stream().anyMatch(s -> s.equals("키보드"));
    }
}
