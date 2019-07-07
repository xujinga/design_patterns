package com.xuj.singletonpattern.test;

/**
 * 懒汉式单例 枚举写法
 */
public class Singleton8 {
    private Singleton8() {
    }

    //延迟加载
    private enum EnumHolder {
        INSTANCE;
        private Singleton8 instance;

        //jvm保证此方法只会被调用一次
        EnumHolder() {
            instance = new Singleton8();
        }

        private Singleton8 getInstance() {
            return instance;
        }
    }

    public static Singleton8 getSingleton() {
        return EnumHolder.INSTANCE.getInstance();
    }
}
