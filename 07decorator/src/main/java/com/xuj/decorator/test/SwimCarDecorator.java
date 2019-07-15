package com.xuj.decorator.test;

/**
 * 具体装饰类  增加会游泳的功能
 */
public class SwimCarDecorator extends Decorator {
    public SwimCarDecorator(Car car) {
        super(car);
    }

    @Override
    protected void doSomething() {
        System.out.println("可以游");
    }

    @Override
    public void show() {
        super.show();
        doSomething();
    }
}
