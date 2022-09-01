package com.haha.designpattern.behavior.strategy;

import com.haha.designpattern.behavior.Question;

/**
 * Created by liuhe on 16-4-10.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void handle(Question question){
        strategy.handleQuestion(question);
    }
}
