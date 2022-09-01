package com.haha.designpattern.behavior.mediator;

import com.haha.designpattern.behavior.TextQuestion;

/**
 * Created by liuhe on 16-4-9.
 */
public class ImageColleague implements Colleague{
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void solveQuestion() {
        if(this.mediator.get()==null){
            System.out.println("please give a question");
            return;
        }
        mediator.get().print();
        System.out.println(this.getClass()+" done");
    }

    public void sendQuestion() {
        mediator.set(new TextQuestion());
//        System.out.println("send by "+this.getClass());
//        return new TextQuestion();
    }
}
