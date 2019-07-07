package com.xuj.prototype.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XuJing
 * @Date: 2019/7/3 20:23
 */
public class Student implements Cloneable {
    private String name;

    private Integer age;

    private String sex;

    private List<String> friends;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", friends=" + friends +
                '}';
    }

  /*  protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }*/

    protected Student clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        List<String> friends = new ArrayList<>();
        for (String friend : student.getFriends()) {
            friends.add(friend);
        }
        student.setFriends(friends);
        return student;
    }
}
