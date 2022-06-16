package com.study.designpattern._03_behavioral_patterns._03_interpreter._04_my;

import java.util.Stack;

// Context
public class PrefixParser {

    public static PrefixExpression parse(String expression) {

        Stack<PrefixExpression> stack = new Stack<>();
        int length = expression.toCharArray().length;
        char[] reverse = new char[expression.toCharArray().length];
        int i = 0;
        for (char c : expression.toCharArray()) {
            reverse[i] = c;
            i++;
        }

        for (int j = length - 1; j >= 0; j--) {
            stack.push(getResult(reverse[j], stack));
        }

        return stack.pop();
    }

    private static PrefixExpression getResult(char c, Stack<PrefixExpression> stack) {
        switch (c) {
            case '+':
                PrefixExpression right = stack.pop();
                PrefixExpression left = stack.pop();
                return new PlusExpression(left, right);
            case '-':
                return new MinusExpression(stack.pop(), stack.pop());
            default:
                return new VariableExpression(c);
        }
    }
}
