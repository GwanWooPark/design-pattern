package com.study.designpattern._03_behavioral_patterns._10_template._04_template_callback;

public class Client {

    public static void main(String[] args) {

        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int plus = fileProcessor.process(new Operator() {
            @Override
            public int getResult(int result, int number) {
                return result += number;
            }
        });
        int minus = fileProcessor.process(((result, number) -> result -= number));

        System.out.println(plus);
        System.out.println(minus);
    }
}
