package com.oyzy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Subject realSubject  = new RealSubject();
        InvocationHandler in = new DynamicProxy(realSubject);
        /*Subject subject1 = (Subject) Proxy.newProxyInstance(in.getClass().getClassLoader(), subject
                .getClass().getInterfaces(), in);*/
        ClassLoader classLoader = in.getClass().getClassLoader();
        Subject subject1 =(Subject) Proxy.newProxyInstance(classLoader, realSubject.getClass().getInterfaces(), in);
        System.out.println(subject1.getClass().getName());
        subject1.rent();
        subject1.hello();


    }
}
