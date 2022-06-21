package com.study.designpattern._03_behavioral_patterns._10_template._02_after;

public class Client {

    public static void main(String[] args) {

        FileProcessor fileProcessor = new Plus("number.txt");
        int plus = fileProcessor.process();
        fileProcessor = new Multiply("number.txt");
        int mul = fileProcessor.process();
        fileProcessor = new Minus("number.txt");
        int minus = fileProcessor.process();


        System.out.println(plus);
        System.out.println(mul);
        System.out.println(minus);
    }
}
