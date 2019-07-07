package com.xuj.builder.test;

/**
 * @Author: XuJing
 * @Date: 2019/7/7 21:27
 */
public class MainClass {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector();
        House pingFang = houseDirector.makeHouse(new PingFangBuilder());
        House gongYu = houseDirector.makeHouse(new GongyuBuilder());
        System.out.println(pingFang);
        System.out.println(gongYu);
    }
}
