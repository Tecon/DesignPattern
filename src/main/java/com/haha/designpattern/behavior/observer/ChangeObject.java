package com.haha.designpattern.behavior.observer;

/**
 * 变更对象，存储变更后的数据
 *
 * @author dongpo
 * @date 2022/9/1 03:46
 */
public class ChangeObject {

    int state;

    public int getState() {
        return state;
    }

    public ChangeObject(int state) {
        this.state = state;
    }
}
