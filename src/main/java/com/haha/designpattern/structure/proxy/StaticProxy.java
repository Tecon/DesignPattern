package com.haha.designpattern.structure.proxy;

import com.haha.designpattern.structure.proxy.base.Shape;
import com.haha.designpattern.structure.proxy.base.Square;

/**
 * @author dongpo
 * @date 2022/8/16 08:00
 */
public class StaticProxy {

    private Shape shape;
    private Square square;

    public StaticProxy(Shape shape) {
        this.shape = shape;
    }

    public StaticProxy(Square square) {
        this.square = square;
    }

    public void show(){
        if (null != shape) {
            System.out.println("static proxy shape start");
            shape.show();
            System.out.println("static proxy shape end");
            System.out.println("");
        }

        if (null != square) {
            System.out.println("static proxy square start");
            square.show();
            System.out.println("static proxy square end");
            System.out.println("");
        }
    }
}
