package com.xuj.singletonpattern.test;

/**
 * 饿汉式单例
 */
public class Singleton1 {

    //创建实例
    private static Singleton1 singleton1 = new Singleton1();

    //私有化构造器
    private Singleton1() {
    }

    //对外提供获取实例的方法
    public static Singleton1 getInstance() {
        return singleton1;
    }
}
