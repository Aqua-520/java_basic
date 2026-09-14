package com.wcy.oop.d_继承;

public class Demo05 {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        student.setName("我是方超峰");
        student.setAge(18);
        student.setDuty("我的职责是学习");

        teacher.setName("张恩泽");
        teacher.setAge(20);
        teacher.setJob("教书育人");

        student.show();
        teacher.show();
    }
}

class Human {
    private String name;
    private int age;

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
        this.age = age;
    }

    public void show() {
        System.out.println("大家好,我叫" + name + ",我今年" + age + "岁");
    }
}

// 学生类和老师类
class Student extends Human {
    // 职责是学习
    private String duty;

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }
}

class Teacher extends Human {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}