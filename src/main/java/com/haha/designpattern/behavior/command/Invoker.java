package com.haha.designpattern.behavior.command;

/**
 * Created by liuhe on 16-4-9.
 */
public class Invoker {
    public Invoker() {
    }

    public void call(Command command){
        command.exec();
    }
}
