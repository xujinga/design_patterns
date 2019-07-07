package com.xuj.builder.test;

/**
 * 房子
 */
public class House {
    //地板
    private String floor;
    //墙
    private String wall;
    //房顶
    private String housetop;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getHousetop() {
        return housetop;
    }

    public void setHousetop(String housetop) {
        this.housetop = housetop;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor='" + floor + '\'' +
                ", wall='" + wall + '\'' +
                ", housetop='" + housetop + '\'' +
                '}';
    }
}
