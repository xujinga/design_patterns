package com.xuj.decorator.test;

/**
 * 具体装饰类  增加会飞的功能
 */
public class FlyCarDecorator extends Decorator {
    public FlyCarDecorator(Car car) {
        super(car);
    }

    @Override
    protected void doSomething() {
        System.out.println("可以飞");
    }

    @Override
    public void show() {
        super.show();
        doSomething();
    }
}
