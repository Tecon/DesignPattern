package com.haha.designpattern.behavior.state;

/**
 *
 * Created by liuhe on 16-4-10.
 */
public class StateClient {
    public static void main(String[] args) throws InterruptedException {
        State initState = new InitState();
        Context context = new Context(initState);
        context.getState().handle();

        context.request();
        Thread.sleep(1000);
        context.getState().handle();

        context.request();
        Thread.sleep(1000);
        context.getState().handle();

        context.request();
        context.getState().handle();
    }
}
