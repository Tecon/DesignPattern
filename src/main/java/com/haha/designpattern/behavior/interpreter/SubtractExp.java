package com.haha.designpattern.behavior.interpreter;

/**
 * @author dongpo
 * @date 2022/9/1 01:45
 */
public class SubtractExp implements Exp {

    Exp first;
    Exp second;

    public SubtractExp(Exp first, Exp second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int evaluate() {
        return first.evaluate() - second.evaluate();
    }
}
