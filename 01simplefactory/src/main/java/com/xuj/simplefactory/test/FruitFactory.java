package com.xuj.simplefactory.test;

public class FruitFactory {

    public static Fruit getFruit(Class<?> clazz) throws InstantiationException, IllegalAccessException {
        Object o = clazz.newInstance();
        if (o instanceof Fruit) {
            return (Fruit) clazz.newInstance();
        } else {
            throw new RuntimeException("未知类型");
        }
    }
}
