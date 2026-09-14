package com.wcy.oop.代码块;

public class Man {
    public static void main(String[] args) {
        // 创建对象
        Pc pc = new Pc();
    }
}

// 随便定义一个类
class Pc {
    // 代码块

    {
        // 这个叫实例代码块,会在创建实例对象的时候,比构造函数优先执行
        System.out.println("实例代码块执行");
    }

    public Pc() {
        System.out.println("这是构造函数,会在实例代码块之后执行");
    }

    // 静态代码块
    static {
        // 最先被执行,通常用于写一一些需要动态计算的值,或者是数据库数据采集等,对变量进行初始化操作
        System.out.println("这是静态代码块,会在class被加载进内存的时候立马执行,但是只会执行一次");
    }
}