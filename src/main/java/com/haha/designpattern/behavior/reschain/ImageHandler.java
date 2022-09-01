package com.haha.designpattern.behavior.reschain;

import com.haha.designpattern.behavior.ImageQuestion;
import com.haha.designpattern.behavior.Question;

/**
 * Created by liuhe on 16-4-9.
 */
public class ImageHandler implements Handler{
    private Handler next;

    @Override
    public void handle(Question question) {
        if(question instanceof ImageQuestion) {
            question.print();
            System.out.println("ImageHandler--->hello world!");
        }else {
            this.next.handle(question);
        }
    }

    public ImageHandler() {
        next = new DefaultHandler();
    }

    public ImageHandler(Handler next) {
        this.next = next;
    }
}
