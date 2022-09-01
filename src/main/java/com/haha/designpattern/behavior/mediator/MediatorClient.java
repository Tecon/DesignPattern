package com.haha.designpattern.behavior.mediator;

/**
 * 这个中介者模式的代码不要参考了，体现不出来引入中介者的目的--新增抽象层次承担原有的任务中的部分逻辑，以降低对象交互的复杂性
 * todo 演示代码重写，给出使用中介者模式之前和之后的代码并加以对比
 *
 * Mediator Pattern
 * like memory share
 * Colleague only knows Mediator,it set Question of mediator and
 * the other get Question solved from it's own mediator, if no question,give Exception or other info
 * all the mediator is shared
 *
 * Created by liuhe on 16-4-9.
 */
public class MediatorClient {
    public static void main(String[] args) {
        Mediator mediator = new QuestionMediator();

        Colleague textColleague = new TextColleague();
        textColleague.setMediator(mediator);

        Colleague imageColleague = new ImageColleague();
        imageColleague.setMediator(mediator);

        //TextColleagues can't solve ImageQuestion,so it sends out,a imageColleague solve the question
        textColleague.sendQuestion();
        imageColleague.solveQuestion();
    }
}
