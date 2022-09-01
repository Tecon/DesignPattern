package com.haha.designpattern.behavior.command;

import com.haha.designpattern.behavior.Question;
import com.haha.designpattern.behavior.TextQuestion;

/**
 * Command Pattern
 * used to separate commandInvoke and commandExecute,so Class Invoker and Interface Command appear
 *
 * invoke needs Command(class Invoker has a Command attr)
 * command exec needs Receiver(class Command has a Receiver attr)
 * receiver do something else
 *
 * class Invoker --> invoke command
 * class Command --> execute command
 * Created by liuhe on 16-4-9.
 */
public class CommandClient {

    public static void main(String[] args) {
        Question textQuestion = new TextQuestion();

        Command command = new TextCommand(textQuestion);
        Command cancelCommand = new TextCancelCommand(textQuestion);


        Invoker invoker = new Invoker();
        invoker.call(command);
        invoker.call(cancelCommand);
    }
}
