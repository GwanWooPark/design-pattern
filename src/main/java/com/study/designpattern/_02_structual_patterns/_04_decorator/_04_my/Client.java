package com.study.designpattern._02_structual_patterns._04_decorator._04_my;

import java.util.List;

public class Client {

    OptionService optionService;

    public Client(OptionService optionService) {
        this.optionService = optionService;
    }

    public void writeResult(List<String> options) {
        optionService.addOption(options);
    }
}
