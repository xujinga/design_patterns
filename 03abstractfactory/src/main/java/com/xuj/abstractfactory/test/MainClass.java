package com.xuj.abstractfactory.test;

public class MainClass {
    public static void main(String[] args) {
        //实例化海尔工厂
        HomeApplianceFactory haier = new HaierFactory();
        //获取海尔电视类
        HomeAppliance haierTV = haier.getTV();
        //生产海尔电视
        haierTV.getProduct();

        //获取海尔冰箱类
        HomeAppliance haierRefrigerator = haier.getRefrigerator();
        //生产海尔冰箱
        haierRefrigerator.getProduct();


        //实例化美的工厂
        HomeApplianceFactory meidi = new MeidiFactory();
        //获取美的电视类
        HomeAppliance meidiTV = meidi.getTV();
        //生产美的电视
        meidiTV.getProduct();

        //获取美的冰箱类
        HomeAppliance meidiRefrigerator = meidi.getRefrigerator();
        //生产美的冰箱
        meidiRefrigerator.getProduct();
    }
}
