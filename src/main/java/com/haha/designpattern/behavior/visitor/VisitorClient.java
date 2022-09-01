package com.haha.designpattern.behavior.visitor;

import java.util.List;

/**
 * Visitor Pattern
 * Visitor has different implement, it make difference sense
 * ObjectStructure means an concrete Object,multiple Elements consist of a ObjectStructure
 * <p>
 * eg:
 * 要创建不同的促销活动,活动中有组合商品,商品的折扣不一样
 * 不同的组合商品代表了不同的visitor,visitor访问时使用不同的折扣
 * 于是不同的促销活动可以不更改任何的商品信息,而只添加不同的visitor
 * ObjectStructure负责维护一个Product和discount的HashMap
 * 这样visitor遍历并访问ObjectStructure即可计算组合商品总价及各个单价
 * <p>
 * 每次有一个新的促销活动就创建一个新的visitor即可
 * <p>
 * Created by liuhe on 16-4-10.
 */
public class VisitorClient {
    public static void main(String[] args) {
        Visitor visitor = new CommonVisitor();
        ObjectStructure objectStructure = new ObjectStructure();

        List<Element> tmp = objectStructure.getList();
        for (Element element : tmp) {
            element.accept(visitor);
        }

        Visitor spVisitor = new SpecialVisitor();
        for (Element element : tmp) {
            element.accept(spVisitor);
        }
    }
}
