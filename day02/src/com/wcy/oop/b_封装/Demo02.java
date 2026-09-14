package com.wcy.oop.b_封装;

public class Demo02 {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("黄一哥");
        student.setAge(11);
        student.setScore(99.99);
        // 访问类属性
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getScore());
    }
}

class Student {
    private String name;
    private int age;
    private double score;

    // 定义修改和访问方法
    public void setName(String name) {
        // 安全性校验
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 100 || age < 0) {
            // 抛异常
            throw new RuntimeException("年龄非法");
        }
        this.age = age;
    }

    public void setScore(double score) {
        if (score > 100 || score < 0) {
            // 抛异常
            throw new RuntimeException("分数");
        }
        this.score = score;
    }

    // 获取
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public void study() {
        System.out.println(this.age + "岁的," + this.name + "正在学习");
    }

    public void takeExam() {
        System.out.println(this.name + "的考试分数是:" + this.score);
    }
}

