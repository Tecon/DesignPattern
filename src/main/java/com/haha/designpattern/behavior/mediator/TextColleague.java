package com.haha.designpattern.behavior.mediator;

import com.haha.designpattern.behavior.ImageQuestion;

/**
 * Created by liuhe on 16-4-9.
 */
public class TextColleague implements Colleague{
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void solveQuestion() {
        if(this.mediator.get()==null){
            System.out.println("please give a question");
            return;
        }
        this.mediator.get().print();
        System.out.println(this.getClass()+" done");
    }

    public void sendQuestion() {
        this.mediator.set(new ImageQuestion());
//        System.out.println("send by "+this.getClass());
//        return new ImageQuestion();
    }
}
