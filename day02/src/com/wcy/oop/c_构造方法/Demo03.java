package com.wcy.oop.c_构造方法;


public class Demo03 {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("黄一哥");
        student.setAge(11);
        student.setScore(99.99);
        // 访问类属性
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getScore());

        System.out.println("------------------------");

        //  创建一个新对象
        Student fangchaofeng = new Student("方超峰", 18, 55.7);

        // 直接通过get访问方法
        fangchaofeng.study();
        fangchaofeng.takeExam();

        System.out.println(fangchaofeng.getName());
        System.out.println(fangchaofeng.getAge());
        System.out.println(fangchaofeng.getScore());
    }
}

class Student {
    private String name;
    private int age;
    private double score;

    // 定义构造器,可以初始化对象属性


    public Student() {
        // 无参构造器
    }

    // 有参构造器
    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

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

