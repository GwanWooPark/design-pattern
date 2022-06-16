package com.study.designpattern._03_behavioral_patterns._03_interpreter._02_after;

import java.util.Map;

public class App {

    public static void main(String[] args) {
        PostfixExpression expression = PostfixParser.parse("xyz+-");
        int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3));
        System.out.println(result);
    }
}
