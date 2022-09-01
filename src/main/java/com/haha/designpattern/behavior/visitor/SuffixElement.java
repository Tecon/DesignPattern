package com.haha.designpattern.behavior.visitor;

/**
 * Created by liuhe on 16-4-10.
 */
public class SuffixElement implements Element{

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void operate(){
        System.out.println("operate suffix");
    }
}
