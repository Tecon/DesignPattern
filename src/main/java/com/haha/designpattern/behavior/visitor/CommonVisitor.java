package com.haha.designpattern.behavior.visitor;

/**
 * Created by liuhe on 16-4-10.
 */
public class CommonVisitor implements Visitor{
    public void visit(PrefixElement prefixElement) {
        System.out.println("comm visit prefix element");
        prefixElement.operate();
    }

    public void visit(SuffixElement suffixElement) {
        System.out.println("comm visit prefix element");
        suffixElement.operate();
    }
}
