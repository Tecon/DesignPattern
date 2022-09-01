package com.haha.designpattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuhe on 16-4-10.
 */
public class AnObserver implements Observer {

    private List<Subject> informList = new ArrayList<Subject>();

    public void update(ChangeObject baseSubject) {
        int state = baseSubject.getState();
        for(Subject subject:informList){
            subject.setState(state);
            System.out.println(subject.getClass()+"updated to "+subject.getState());
        }
    }
    public void addInformSubject(Subject subject){
        informList.add(subject);
    }

    public void deleteInformSubject(Subject subject) {
        informList.remove(informList.indexOf(subject));
    }
}
