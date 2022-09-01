package com.haha.designpattern.behavior.iterator;

/**
 * 哈哈哈，这个迭代器是上学的时候写着玩的，虽然比较糙，但是迭代器的基本思想是体现出来了
 *
 * Created by liuhe on 16-4-9.
 */
public class IteratorClient {

    public static void main(String[] args) {
        AggregateList aggregateList = new AggregateList();
        Iterater<Integer> iterater = aggregateList.createIterator();
        while (iterater.hasNext()){
            System.out.println(iterater.next());
            //iterater.remove();
        }

        System.out.println(iterater.hasNext());
    }
}
