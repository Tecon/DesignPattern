package com.haha.designpattern.behavior.interpreter;

import java.util.Stack;

/**
 * @author dongpo
 * @date 2022/9/1 01:48
 */
public class InterpreterClient {

    public static void main(String[] args) {

        /* POSTFIX Expression to be evaluated */
        String postfix = "543-2+*";

        /* Operations supported */
        final String OPERATORS = "+-*/";

        /* Stack for the operands */
        Stack<Exp> stack = new Stack<>();

        for (char c : postfix.toCharArray()) {
            Exp resultExp;
            if (OPERATORS.indexOf(c) == -1) {
                /* number found, push it onto the stack */
                resultExp = new NumberExp(c - 48);
            } else {
                /*
                 * operator found, pop out the last two operands from the stack and
                 * perform the operation
                 */
                Exp right = stack.pop();
                Exp left = stack.pop();

                switch (c) {

                    case '+':
                        resultExp = new AddExp(left, right);
                        break;
                    case '-':
                        resultExp = new SubtractExp(left, right);
                        break;
                    case '*':
                        resultExp = new MultiplyExp(left, right);
                        break;
                    case '/':
                        resultExp = new DivideExp(left, right);
                        break;
                    default:
                        resultExp = new NumberExp(0);
                }
            }
            /* push the result onto the stack */
            stack.push(new NumberExp(resultExp.evaluate()));
        }
        System.out.println("Result: " + stack.pop().evaluate());
    }

}
