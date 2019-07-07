package com.xuj.abstractfactory.test;

/**
 * 美的冰箱类
 */
public class MeidiRefrigerator extends Refrigerator {
    @Override
    public void getProduct() {
        System.out.println("生产美的冰箱");
    }
}
