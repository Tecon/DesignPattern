package com.haha.designpattern.behavior.visitor;

/**
 * Created by liuhe on 16-4-10.
 */
public interface Element {
    public void accept(Visitor visitor);
}
