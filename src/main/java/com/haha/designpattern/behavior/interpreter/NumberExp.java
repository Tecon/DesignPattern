package com.haha.designpattern.behavior.interpreter;

/**
 * @author dongpo
 * @date 2022/9/1 01:47
 */
public class NumberExp implements Exp {

    private final int n;

    public NumberExp(int n) {
        this.n = n;
    }

    @Override
    public int evaluate() {
        return n;
    }
}
