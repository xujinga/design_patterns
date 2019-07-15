package com.xuj.decorator.test;

/**
 * 抽象装饰类
 * 维护一个指向抽象构件对象的引用，通过该引用可以调用装饰之前构件对象的方法，并通过其子类扩展该方法，以达到装饰的目的。
 * 定义一个抽象的方法，子类重新以增加功能  子类也可以重新定义别的方法来增加功能
 */
public abstract class Decorator implements Car {

    private Car car;

    public Decorator(Car car) {
        this.car = car;
    }

    protected abstract void doSomething();


    @Override
    public void run() {
        this.car.run();
    }

    @Override
    public void show() {
        this.car.show();
    }
}
