package com.study.designpattern._03_behavioral_patterns._03_interpreter._02_after;

import java.util.Map;

public interface PostfixExpression {

    int interpret(Map<Character, Integer> context);
}
