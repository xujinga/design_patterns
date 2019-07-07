package com.xuj.simplefactory.test;

public class MainClass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Fruit apple = FruitFactory.getFruit(Apple.class);
        Fruit banana = FruitFactory.getFruit(Banana.class);
        apple.get();
        banana.get();
    }
}
