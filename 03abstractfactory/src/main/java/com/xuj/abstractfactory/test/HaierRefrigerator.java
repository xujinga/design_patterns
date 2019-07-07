package com.xuj.abstractfactory.test;

/**
 * 海尔冰箱类
 */
public class HaierRefrigerator extends Refrigerator{
    @Override
    public void getProduct() {
        System.out.println("生产海尔冰箱");
    }
}
