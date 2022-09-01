package com.haha.designpattern.structure.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import com.haha.designpattern.structure.proxy.base.Circle;
import com.haha.designpattern.structure.proxy.base.Shape;
import com.haha.designpattern.structure.proxy.base.Square;

import java.lang.reflect.Method;

/**
 * @author dongpo
 * @date 2022/8/16 07:59
 */
public class CglibDynamicProxy {
    private Shape shape;
    private Square square;

    public CglibDynamicProxy(Shape shape) {
        this.shape = shape;
    }

    public CglibDynamicProxy(Square square) {
        this.square = square;
    }

    private class ProxyMethodInterceptor implements MethodInterceptor {
        private Enhancer enhancer = new Enhancer();
        public Object getProxy(Class clazz){
            //设置需要创建子类的类
            enhancer.setSuperclass(clazz);
            enhancer.setCallback(this);
            //通过字节码技术动态创建子类实例
            return enhancer.create();
        }

        @Override
        public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("cglib dynamic proxy object start");
            Object result = methodProxy.invokeSuper(obj, objects);
            System.out.println("cglib dynamic proxy object end");
            System.out.println("");

            return result;
        }
    }

    public void show(){
        ProxyMethodInterceptor proxyMethodInterceptor = new ProxyMethodInterceptor();
        if (shape != null) {
            Circle circleProxy = (Circle) proxyMethodInterceptor.getProxy(shape.getClass());
            circleProxy.show();
        }

        if (square != null) {
            Square squareProxy = (Square) proxyMethodInterceptor.getProxy(square.getClass());
            squareProxy.show();
        }
    }

}
