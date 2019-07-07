package com.xuj.builder.test;

/**
 * 房屋抽象建造者
 */
public interface HouseBuilder {
    //建造地板
    public void makeFloor();

    //建造墙
    public void makeWall();

    //建造屋顶
    public void makeHousetop();

    //返回实体
    public House getHouse();
}
