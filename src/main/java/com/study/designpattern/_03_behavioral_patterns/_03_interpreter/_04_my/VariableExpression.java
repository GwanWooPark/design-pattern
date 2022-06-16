package com.study.designpattern._03_behavioral_patterns._03_interpreter._04_my;

import java.util.Map;

// Terminal Expression
public class VariableExpression implements PrefixExpression {

    private Character character;

    public VariableExpression(Character character) {
        this.character = character;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(character);
    }
}
