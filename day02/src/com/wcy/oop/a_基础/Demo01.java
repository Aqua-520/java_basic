package com.wcy.oop.a_基础;

public class Demo01 {
    public static void main(String[] args) {
        // 设置属性
        Student student = new Student();

        student.name = "我是无敌小汪";
        student.age = 18;
        student.score = 99.8;

        // 调用方法
        student.study();
        student.takeExam();
    }
}

// 自定义类
class Student {
    String name;
    byte age;
    double score;

    public void study() {
        System.out.println(this.age + "岁的," + this.name + "正在学习");
    }

    public void takeExam() {
        System.out.println(this.name + "的考试分数是:" + this.score);
    }
}
