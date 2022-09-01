package com.haha.designpattern.behavior.interpreter;

/**
 * @author dongpo
 * @date 2022/9/1 01:44
 */
public class AddExp implements Exp {

    Exp first;
    Exp second;

    public AddExp(Exp first, Exp second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int evaluate() {
        return first.evaluate() + second.evaluate();
    }
}
