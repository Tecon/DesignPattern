package com.haha.designpattern.structure.proxy;

import com.haha.designpattern.structure.proxy.base.Shape;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author dongpo
 * @date 2022/8/15 19:06
 */
public class JDKDynamicProxy {

    private Object object;

    public JDKDynamicProxy(Object object) {
        this.object = object;
    }

    private class SquareHandler implements InvocationHandler {
        private Object obj;

        public SquareHandler(Object obj) {
            this.obj = obj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("jdk dynamic proxy object start");
            Object invoke = method.invoke(obj, args);
            System.out.println("jdk dynamic proxy object end");
            System.out.println("");
            return invoke;
        }
    }


    public void show(){
//        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        InvocationHandler handler = new SquareHandler(this.object);
        Shape shape = (Shape) Proxy.newProxyInstance(
                this.object.getClass().getClassLoader(),
                this.object.getClass().getInterfaces(),
                handler);

        shape.show();
    }
}
