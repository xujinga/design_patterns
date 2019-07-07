package com.xuj.singletonpattern.test;

/**
 * 懒汉式单例 方法上加锁（效率慢，不推荐使用）
 */
public class Singleton3 {
    //指向实例的静态引用
    private static Singleton3 singleton3;

    //私有化构造器
    private Singleton3() {
    }

    //整个方法加锁 效率不高
    public static synchronized Singleton3 getInstance() {
        if (null == singleton3) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}
