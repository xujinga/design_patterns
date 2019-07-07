package com.xuj.abstractfactory.test;


/**
 * 家电工厂类
 */
public interface HomeApplianceFactory {
    //获取电视
    HomeAppliance getTV();

    //获取冰箱
    HomeAppliance getRefrigerator();
}
