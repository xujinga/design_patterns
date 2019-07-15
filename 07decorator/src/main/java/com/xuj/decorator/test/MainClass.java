package com.xuj.decorator.test;

/**
 * @Author: XuJing
 * @Date: 2019/7/15 21:21
 */
public class MainClass {
    public static void main(String[] args) {
        Car car = new RunCar();
        car.show();
        System.out.println("--------------------------------------------------------------");
        car = new FlyCarDecorator(car);
        car.show();
        System.out.println("--------------------------------------------------------------");
        car = new SwimCarDecorator(car);
        car.show();
    }
}
