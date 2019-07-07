package com.xuj.factorymethod.test;

public class MainClass {
    public static void main(String[] args) {
        FruitFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.getFruit();
        apple.get();

        FruitFactory bananeFactory = new BananaFactory();
        Fruit banana = bananeFactory.getFruit();
        banana.get();
    }
}
