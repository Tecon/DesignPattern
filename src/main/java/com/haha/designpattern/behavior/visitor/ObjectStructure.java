package com.haha.designpattern.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuhe on 16-4-10.
 */
public class ObjectStructure {
    private List<Element> list = new ArrayList<Element>();

    public void add(Element element) {
        list.add(element);
    }

    public List<Element> getList(){
        list.add(new PrefixElement());
        list.add(new SuffixElement());
        return list;
    }
}
