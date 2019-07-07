package com.xuj.prototype.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XuJing
 * @Date: 2019/7/3 20:25
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.setName("张三");
        student.setAge(11);
        student.setSex("男");

        List<String> friends = new ArrayList<>();
        friends.add("王五");
        friends.add("赵七");
        student.setFriends(friends);

        Student clone = student.clone();
        List<String> friends1 = student.getFriends();
        friends1.add("王八");
        student.setFriends(friends1);
        System.out.println(student);
        System.out.println(clone);
    }
}
