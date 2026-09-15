package com.wcy.数据容器.ArrayList;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSet对对象的去重 {
    public static void main(String[] args) {
        Set<Student> stuSet = new HashSet<>();

        // 直接创建学生对象放入集合
        stuSet.add(new Student("张三", 18));
        stuSet.add(new Student("李四", 19));
        stuSet.add(new Student("王五", 20));
        stuSet.add(new Student("张三", 18)); // 内容相同，测试去重

        System.out.println(stuSet);
    }
}


// 定义学生对象
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 省略setter和getter方法了...
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 重写两个对象比较的方法即可实现去重

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}