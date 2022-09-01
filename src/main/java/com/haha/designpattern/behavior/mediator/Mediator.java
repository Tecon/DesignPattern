package com.haha.designpattern.behavior.mediator;

import com.haha.designpattern.behavior.Question;

/**
 * Created by liuhe on 16-4-9.
 */
public interface Mediator {
    public void set(Question question);
    public Question get();
}
