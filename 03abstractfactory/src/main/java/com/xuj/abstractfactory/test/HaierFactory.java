package com.xuj.abstractfactory.test;

/**
 * 海尔工厂
 */
public class HaierFactory implements HomeApplianceFactory{
    @Override
    public HomeAppliance getTV() {
        return new HaierTV();
    }

    @Override
    public HomeAppliance getRefrigerator() {
        return new HaierRefrigerator();
    }
}
