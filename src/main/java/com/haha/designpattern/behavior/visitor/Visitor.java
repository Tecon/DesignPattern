package com.haha.designpattern.behavior.visitor;

/**
 * Created by liuhe on 16-4-10.
 */
public interface Visitor {
    public void visit(PrefixElement prefixElement);

    public void visit(SuffixElement suffixElement);
}
