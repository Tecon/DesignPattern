package com.haha.designpattern.behavior.command;

import com.haha.designpattern.behavior.Question;

/**
 * @author dongpo
 * @date 2022/9/1 00:59
 */
public class TextCancelCommand implements Command {

    private Question question;

    public TextCancelCommand(Question question) {
        this.question = question;
    }

    @Override
    public void exec() {
        question.print();
        System.out.println("text cancel command");
    }
}
