package com.haha.designpattern.behavior.mediator;

/**
 * Created by liuhe on 16-4-9.
 */
public interface Colleague {
    public void solveQuestion();

    public void sendQuestion();

    public void setMediator(Mediator mediator);
}
