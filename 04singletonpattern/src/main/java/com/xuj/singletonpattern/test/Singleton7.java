package com.xuj.singletonpattern.test;

/**
 * 懒汉式单例 静态内部类方法
 */
public class Singleton7 {
    private static class Holder {
        private static Singleton7 singleton = new Singleton7();
    }

    private Singleton7() {
    }

    public static Singleton7 getSingleton() {
        return Holder.singleton;
    }
}
