package com.wcy.oop.Homework;

public class Person {
    public static void main(String[] args) {
        WcyPerson wcyPerson = new WcyPerson();

        // 手动设置值
        wcyPerson.setName("汪宸宇");
        wcyPerson.setAge(19);
        wcyPerson.setGender('女');

        System.out.println(wcyPerson);
    }
}

class WcyPerson {
    // 私有属性
    private String name;
    private int age;
    private char gender;

    // 构造器

//    public WcyPerson(String name, int age, char gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new RuntimeException("年龄输入非法");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender != '男' && gender != '女') {
            // 如果更新为空,直接报错
            throw new RuntimeException("性别设置错误");
        }
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "WcyPerson{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
