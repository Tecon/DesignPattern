package com.haha.designpattern.behavior.strategy;

import com.haha.designpattern.behavior.Question;

/**
 * Created by liuhe on 16-4-10.
 */
public class CarelessHandleStrategy implements Strategy{

    @Override
    public void handleQuestion(Question question) {
        System.out.println("-----careless handle-----");
        question.print();
        System.out.println("-----careless handle-----");
    }
}
