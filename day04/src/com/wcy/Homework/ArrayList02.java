package com.wcy.Homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        /*
            创建存储学生对象的ArrayList集合，
            学生属性：姓名、年龄，添加3个学生对象，使用迭代器遍历输出所有学生信息
         */
        // 创建集合
        List<Student> studentList = new ArrayList<>();

        // 创建三个学生添加
        studentList.add(new Student("黄一个", (byte) 18));
        studentList.add(new Student("黄二个", (byte) 30));
        studentList.add(new Student("黄三个", (byte) 50));

        // 创建迭代器
        Iterator<Student> studentIterator = studentList.iterator();
        while (studentIterator.hasNext()) {
            // 调用迭代器next返回每一个学生对象
            System.out.println(studentIterator.next());
        }
    }
}

// 定义学生类
class Student {
    private String name;
    private byte age;

    public Student(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
