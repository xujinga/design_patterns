package com.xuj.builder.test;

/**
 * 平房建造者（实际建造者）
 */
public class PingFangBuilder implements HouseBuilder {
    House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("平房-->地板");
    }

    @Override
    public void makeHousetop() {
        house.setHousetop("平房-->房顶");
    }

    @Override
    public void makeWall() {
        house.setWall("平房-->墙");
    }

    @Override
    public House getHouse() {
        return house;
    }

}
