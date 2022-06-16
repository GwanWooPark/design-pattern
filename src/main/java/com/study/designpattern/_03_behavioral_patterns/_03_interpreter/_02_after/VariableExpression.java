package com.study.designpattern._03_behavioral_patterns._03_interpreter._02_after;

import java.util.Map;

// Terminal Expression
public class VariableExpression implements PostfixExpression{

    private Character variable;

    public VariableExpression(Character variable) {
        this.variable = variable;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(variable);
    }
}
