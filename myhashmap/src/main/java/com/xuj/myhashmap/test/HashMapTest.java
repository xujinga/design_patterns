package com.xuj.myhashmap.test;

/**
 * @Author: XuJing
 * @Date: 2019/6/29 19:56
 */
public class HashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        for (int i = 1; i <= 10; i++) {
          myHashMap.put(i+"张三","王五");
        }
        System.out.println(myHashMap.get("9张三"));
    }
}
