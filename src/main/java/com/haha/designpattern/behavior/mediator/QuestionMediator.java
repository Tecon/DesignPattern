package com.haha.designpattern.behavior.mediator;

import com.haha.designpattern.behavior.Question;

/**
 * Created by liuhe on 16-4-9.
 */
public class QuestionMediator implements Mediator{
    private TextColleague textColleage = new TextColleague();
    private ImageColleague imageColleage = new ImageColleague();
    private Question question;

    @Override
    public void set(Question question) {
        this.question = question;
    }

    @Override
    public Question get() {
        return this.question;
    }
}
