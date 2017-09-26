package com.oyzy;

/**
 * Created by Administrator on 2017/9/1.
 */
public class RealSubject implements Subject {
    @Override
    public void rent() {
        System.out.println("rent!");
    }

    @Override
    public void hello() {
        System.out.println("hello!");
    }
}
