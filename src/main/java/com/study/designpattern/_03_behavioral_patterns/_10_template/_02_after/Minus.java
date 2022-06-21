package com.study.designpattern._03_behavioral_patterns._10_template._02_after;

public class Minus extends FileProcessor {

    public Minus(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int number) {
        return result -= number;
    }
}
