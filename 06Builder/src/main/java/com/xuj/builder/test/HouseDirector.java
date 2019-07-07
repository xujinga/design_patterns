package com.xuj.builder.test;

/**
 * 指挥者
 */
public class HouseDirector {

    public House makeHouse(HouseBuilder builder) {
        builder.makeFloor();
        builder.makeWall();
        builder.makeHousetop();
        return builder.getHouse();
    }

}
