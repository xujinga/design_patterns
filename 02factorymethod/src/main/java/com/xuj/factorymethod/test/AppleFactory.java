package com.xuj.factorymethod.test;

/**
 * @Author: XuJing
 * @Date: 2019/6/27 19:51
 */
public class AppleFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
