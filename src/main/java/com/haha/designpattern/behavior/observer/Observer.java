package com.haha.designpattern.behavior.observer;

/**
 * Created by liuhe on 16-4-10.
 */
public interface Observer {
    public void update(ChangeObject updateObj);
    public void addInformSubject(Subject subject);
    public void deleteInformSubject(Subject subject);
}
