package com.xuj.factorymethod.test;

/**
 * @Author: XuJing
 * @Date: 2019/6/27 19:52
 */
public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
