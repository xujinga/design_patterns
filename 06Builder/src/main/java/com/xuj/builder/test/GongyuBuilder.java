package com.xuj.builder.test;

/**
 * 公寓建造者（实际建造者）
 */
public class GongyuBuilder implements HouseBuilder {

    House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("公寓-->地板");
    }

    @Override
    public void makeHousetop() {
        house.setHousetop("公寓-->房顶");
    }

    @Override
    public void makeWall() {
        house.setWall("公寓-->墙");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
