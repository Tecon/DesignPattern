package com.haha.designpattern.behavior.state;

/**
 * Created by liuhe on 16-4-10.
 */
public class StartState implements State{
    public void handle() {
        System.out.println("I'm ready to run!");
    }
}
