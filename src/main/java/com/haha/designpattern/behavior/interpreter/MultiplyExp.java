package com.haha.designpattern.behavior.interpreter;

/**
 * @author dongpo
 * @date 2022/9/1 01:45
 */
public class MultiplyExp implements Exp {

    Exp first;
    Exp second;

    public MultiplyExp(Exp first, Exp second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int evaluate() {
        return first.evaluate() * second.evaluate();
    }
}
