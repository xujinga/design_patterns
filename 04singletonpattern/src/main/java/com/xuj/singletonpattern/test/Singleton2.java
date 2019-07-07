package com.xuj.singletonpattern.test;

/**
 * 懒汉式单例 单线程写法
 */
public class Singleton2 {
    //指向实例的静态引用
    private static Singleton2 singleton2;

    //私有化构造器
    private Singleton2() {
    }

    //对外提供获取实例的方法
    public static Singleton2 getInstance() {
        if (null == singleton2) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
