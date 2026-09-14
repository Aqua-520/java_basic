package com.wcy.oop.多态_a;

public class Demo03 {
    public static void main(String[] args) {
        // 生成运动会
        Activity activity = new Activity();

//        new Human02();
        activity.run_match(new Teacher());
    }
}

// 抽象类无法创建对象
abstract class Human02 {
    public void run() {
        System.out.println("在跑步");
    }
}

// 定义学生和老师

class Student extends Human02 {
    // 重写跑步


    @Override
    public void run() {
//        super.run();
        System.out.println("学生跑得快,嘎嘎跑的飞起");
    }
}

class Teacher extends Human02 {
    @Override
    public void run() {
//        super.run();
        System.out.println("老师腰不好,跑的慢慢的");
    }

    // 定义老师自己独有的方法
    public void start() {
        System.out.println("做一些热身运动");
    }
}

//定义运动会

class Activity {
    public void run_match(Human02 human) {
        // 如果传入的是老师类型,则可以实现强制类型转换
        if (human instanceof Teacher teacher) {
            teacher.start();
        }

        // 使用多态的跑步
        human.run();
    }
}