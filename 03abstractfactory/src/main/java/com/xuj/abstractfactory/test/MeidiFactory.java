package com.xuj.abstractfactory.test;

/**
 * 美的工厂
 */
public class MeidiFactory implements HomeApplianceFactory {
    @Override
    public HomeAppliance getTV() {
        return new MeidiTV();
    }

    @Override
    public HomeAppliance getRefrigerator() {
        return new MeidiRefrigerator();
    }
}
