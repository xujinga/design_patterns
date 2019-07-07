package com.xuj.singletonpattern.test;

/**
 * 懒汉式单例 方法内加锁 会有问题
 */
public class Singleton4 {
    //指向实例的静态引用
    private  static Singleton4 singleton3;

    //私有化构造器
    private Singleton4() {
    }


    // 会出问题，出现多个实例
    public static Singleton4 getInstance() {
        if (null == singleton3) {
            synchronized (Singleton4.class) {
                singleton3 = new Singleton4();
            }
        }
        return singleton3;
    }

}
