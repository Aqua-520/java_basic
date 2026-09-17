package com.wcy.Homework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSet01 {
    public static void main(String[] args) {
        /*
            创建自定义Person类（姓名、年龄），重写hashCode和equals方法，
            向HashSet中添加2个属性完全相同的Person对象，验证去重效果，遍历输出集合元素
         */
        // 创建set集合
        Set<Person> hashSet = new HashSet<>();

        //  存储两个对象,没有去重
        hashSet.add(new Person("黄一个", 18));
        hashSet.add(new Person("黄一个", 18));

        System.out.println(hashSet);

    }
}

// 创建Person类
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 只提供get方法

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 重写对象比对的两个方法,进行集合去重

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
