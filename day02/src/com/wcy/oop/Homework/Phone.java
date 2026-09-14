package com.wcy.oop.Homework;

public class Phone {
    public static void main(String[] args) {
        Iphone iphone18promax = new Iphone();

        iphone18promax.call();
    }
}

class MyPhone {
    public void call() {
        System.out.println("我是诺基亚,我要打电话");
    }
}

class Iphone extends MyPhone {
    public void call() {
        System.out.println("欢迎来到新生代的苹果");
    }
}