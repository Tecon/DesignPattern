package com.haha.designpattern.behavior.reschain;

import com.haha.designpattern.behavior.Question;

/**
 * Created by liuhe on 16-4-9.
 */
public class DefaultHandler implements Handler{

    @Override
    public void handle(Question question) {
        question.print();
        System.out.println("DefaultHandler--->no handler");
    }
}
