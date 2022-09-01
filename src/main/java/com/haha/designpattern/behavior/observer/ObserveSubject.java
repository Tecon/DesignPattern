package com.haha.designpattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuhe on 16-4-10.
 */
public class ObserveSubject implements Subject{
    private List<Observer> observerList = new ArrayList<Observer>();
    private int state = 0;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        for(Observer observer:observerList){
            observer.update(new ChangeObject(state));
        }
    }
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observerList.remove(observerList.indexOf(observer));
    }
}
