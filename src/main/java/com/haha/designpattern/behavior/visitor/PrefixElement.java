package com.haha.designpattern.behavior.visitor;

/**
 * Created by liuhe on 16-4-10.
 */
public class PrefixElement implements Element{
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void operate(){
        System.out.println("operate prefix");
    }
}
