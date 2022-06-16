package com.study.designpattern._03_behavioral_patterns._03_interpreter._04_my;

import java.util.Map;

// Expression
public interface PrefixExpression {

    int interpret(Map<Character, Integer> context);
}
