package com.haha.designpattern.behavior.reschain;

import com.haha.designpattern.behavior.Question;
import com.haha.designpattern.behavior.TextQuestion;

/**
 * Created by liuhe on 16-4-9.
 */
public class TextHandler implements Handler{
    private Handler next;

    @Override
    public void handle(Question question) {
        if(question instanceof TextQuestion) {
            question.print();
            System.out.println("TextHandler--->hello world!");
        }else{
            next.handle(question);
        }
    }

    public TextHandler() {
        next = new ImageHandler();
    }

    public TextHandler(Handler next) {
        this.next = next;
    }
}
