package com.haha.designpattern.behavior.strategy;


import com.haha.designpattern.behavior.Question;

/**
 * Created by liuhe on 16-4-10.
 */
public class CarefulHandleStrategy implements Strategy{

    @Override
    public void handleQuestion(Question question) {
        System.out.println("-----carefull handle-----");
        question.print();
        System.out.println("-----carefull handle-----");
    }
}
