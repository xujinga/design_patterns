package com.xuj.singletonpattern.test;

/**
 * 懒汉式单例 双重检测加volatile
 */
public class Singleton6 {
    //指向实例的静态引用
    private volatile static Singleton6 singleton3;

    //私有化构造器
    private Singleton6() {
    }


    //方法3：双重检测 + volatile
    public static Singleton6 getInstance() {
        if (null == singleton3) {
            synchronized (Singleton6.class) {
                if (null == singleton3) {
                    singleton3 = new Singleton6();
                }
            }
        }
        return singleton3;
    }
}
