package com.xuj.decorator.test;

/**
 * 具体构件 会跑的车
 */
public class RunCar implements Car {
    @Override
    public void run() {
        System.out.println("可以跑");
    }

    @Override
    public void show() {
        this.run();
    }
}
