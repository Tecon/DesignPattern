package com.haha.designpattern.structure.proxy;

import com.haha.designpattern.structure.proxy.base.Circle;
import com.haha.designpattern.structure.proxy.base.Shape;
import com.haha.designpattern.structure.proxy.base.Square;

/**
 * @author dongpo
 * @date 2022/8/16 08:01
 */
public class ProxyClient {

    public static void main(String[] args) {
        // init class to be proxy
        Shape circle = new Circle();
        Square square = new Square();

        // demo static proxy
        StaticProxy staticProxy = new StaticProxy(circle);
        staticProxy.show();

        staticProxy = new StaticProxy(square);
        staticProxy.show();


        // demo jdk dynamic proxy
        JDKDynamicProxy jdkDynamicProxy = new JDKDynamicProxy(circle);
        jdkDynamicProxy.show();

        try {
            jdkDynamicProxy = new JDKDynamicProxy(square);
            jdkDynamicProxy.show();
        } catch (Throwable throwable) {
            System.out.println("squareJDKDynamicProxy error \n");
            // System.out.println(throwable.getMessage());
        }


        // demo cglib dynamic proxy
        CglibDynamicProxy cglibDynamicProxy = new CglibDynamicProxy(circle);
        cglibDynamicProxy.show();

        cglibDynamicProxy = new CglibDynamicProxy(square);
        cglibDynamicProxy.show();
    }

}
