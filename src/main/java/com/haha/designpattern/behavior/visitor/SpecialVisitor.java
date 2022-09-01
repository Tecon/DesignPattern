package com.haha.designpattern.behavior.visitor;

/**
 * Created by liuhe on 16-4-10.
 */
public class SpecialVisitor implements Visitor{

    @Override
    public void visit(PrefixElement prefixElement) {
        System.out.println("sp visit prefix element");
        prefixElement.operate();
    }

    @Override
    public void visit(SuffixElement suffixElement) {
        System.out.println("sp visit suffix element");
        suffixElement.operate();
    }
}
