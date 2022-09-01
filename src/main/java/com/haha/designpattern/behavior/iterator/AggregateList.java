package com.haha.designpattern.behavior.iterator;

/**
 * Created by liuhe on 16-4-9.
 */
public class AggregateList implements Aggregate{
    private int[] a = {0,1,2,3,4,5,6,7,8,9};
    private int current = 0;
    private int last = 0;

    @Override
    public Iterater<Integer> createIterator() {
        return new Iterater() {
            public Integer next() {
                int value;
                last = current;
                value = current>9?null:a[current++];
                return value;
            }

            public boolean hasNext() {
                return current>9?false:true;
            }

            public Integer first() {
                current = 0;
                last = 0;
                return next();
            }

            public void remove() {
                int[] tmp = new int[10];
                System.arraycopy(a,0,tmp,0,last);
                System.arraycopy(a,last+1,tmp,last,a.length-last-1);
                a=tmp;
                current = last;
            }
        };
    }

    public AggregateList() {
    }
}
