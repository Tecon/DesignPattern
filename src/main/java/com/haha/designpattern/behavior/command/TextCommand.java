package com.haha.designpattern.behavior.command;

import com.haha.designpattern.behavior.Question;

/**
 * Created by liuhe on 16-4-9.
 */
public class TextCommand implements Command{
    private Question question;

    public TextCommand(Question question) {
        this.question = question;
    }

    @Override
    public void exec() {
        question.print();
        System.out.println("TextCommand--->hello world!");
    }
}
