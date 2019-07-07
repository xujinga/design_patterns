package com.xuj.singletonpattern.test;

/**
 * 懒汉式单例 双重检测
 */
public class Singleton5 {
    //指向实例的静态引用
    private static Singleton5 singleton3;

    //私有化构造器
    private Singleton5() {
    }

    //双重检测
    public static Singleton5 getInstance() {
        if (null == singleton3) {
            synchronized (Singleton5.class) {
                if (null == singleton3) {
                    singleton3 = new Singleton5();//err 指令重排 会出问题
                }
            }
        }
        return singleton3;
    }
}
