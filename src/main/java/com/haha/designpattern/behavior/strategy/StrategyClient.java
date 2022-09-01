package com.haha.designpattern.behavior.strategy;

import com.haha.designpattern.behavior.Question;
import com.haha.designpattern.behavior.TextQuestion;

/**
 * Strategy Pattern
 * Context has a Strategy to handle question,different strategy refers to different handle Stategy
 * different handle Strategy is certain when construct the special object
 * Strategy has two implements here,you can add as you like
 *
 * different to State:
 * State is change in Context,it is certain when logic is certain    ------state changes behavior
 * Strategy is change by different call,so we can copy with different logic     ------different strategy copy with diff question
 *
 * Created by liuhe on 16-4-10.
 */
public class StrategyClient {
    public static void main(String[] args) {
        Question question = new TextQuestion();

        Context context = new Context(new CarefulHandleStrategy());
        context.handle(question);

        context = new Context(new CarelessHandleStrategy());
        context.handle(question);
    }
}
