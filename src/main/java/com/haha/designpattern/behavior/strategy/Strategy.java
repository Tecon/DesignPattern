package com.haha.designpattern.behavior.strategy;

import com.haha.designpattern.behavior.Question;

/**
 * Created by liuhe on 16-4-10.
 */
public interface Strategy {
    public void handleQuestion(Question question);
}
