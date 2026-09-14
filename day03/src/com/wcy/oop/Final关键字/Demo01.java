package com.wcy.oop.Final关键字;

public class Demo01 {
    public static void main(String[] args) {
        final String name = "汪宸宇无敌";
        // final修饰的变量无法重新赋值
//        name = "汪宸宇好丑";
    }
}

//final class Father {
//
//}

class Father02 {
    public final void run() {
        System.out.println("不允许重写我,我爱跑步");
    }
}

// 被final修饰的,类无法被继承
class Son extends Father02 {
    // 无法重写
//    @Override
//    public void run() {
//    }
}


