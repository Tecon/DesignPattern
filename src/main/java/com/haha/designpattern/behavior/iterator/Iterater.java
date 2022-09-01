package com.haha.designpattern.behavior.iterator;

/**
 * Created by liuhe on 16-4-9.
 */
public interface Iterater<T> {
    T next();
    boolean hasNext();
    T first();
    void remove();
}
