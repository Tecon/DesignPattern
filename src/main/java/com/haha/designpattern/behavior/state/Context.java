package com.haha.designpattern.behavior.state;

/**
 * Created by liuhe on 16-4-10.
 */
public class Context {
    private static long start = System.currentTimeMillis();
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void request() {
        long now = System.currentTimeMillis();
        long inter = now - start;

        if (inter < 1000) {
            if (!(state instanceof StartState)) {
                state = new StartState();
            }
        } else if (inter < 2000) {
            if (!(state instanceof RunState)) {
                state = new RunState();
            }
        } else {
            if (!(state instanceof StopState)) {
                state = new StopState();
            }
        }
    }
}
