package com.xuj.abstractfactory.test;

/**
 * 海尔电视类
 */
public class HaierTV extends TV {
    @Override
    public void getProduct() {
        System.out.println("生产海尔电视");
    }
}
