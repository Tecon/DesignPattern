package com.haha.designpattern.behavior.observer;

/**
 * Created by liuhe on 16-4-10.
 */
public interface Subject {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void setState(int state);
    public int getState();
}
