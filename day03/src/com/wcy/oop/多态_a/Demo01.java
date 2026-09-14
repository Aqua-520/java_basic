package com.wcy.oop.多态_a;

public class Demo01 {
    public static void main(String[] args) {
        // 实例化黑马程序员
        Heima heima = new Heima();

        heima.son(new Heidiao());
        heima.son(new Baidiao());
    }
}


abstract class Human {
    // 定义方法
    // 抽象方法必须指定在抽象类
    // 抽象类必须被继承
    public abstract void son();
}

class Heidiao extends Human {

    // 方法重写实现多态

    @Override
    public void son() {
//        super.son();
        System.out.println("黑吊会跳街舞");
    }
}

class Baidiao extends Human {
    @Override
    public void son() {
//        super.son();
        System.out.println("白吊会科研");
    }
}

class Heima {
    // 定义黑马程序类
    public void son(Human human) {
        // 接收一个人类对象进
        human.son();
    }
}