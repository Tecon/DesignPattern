package com.haha.designpattern.behavior.state;

/**
 * @author dongpo
 * @date 2022/9/1 04:17
 */
public class InitState implements State {
    @Override
    public void handle() {
        System.out.println("I'm init");
    }
}
