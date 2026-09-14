package com.wcy.oop.多态_a;

// 定义接口
// 接口是自带修饰符的特殊类
interface Interface01 {
    // 接口是一种类型,变量相当于规定一个定死的常量
    // 自带public 公开的属性 static,无法实例化给对象 final 无法修改 三个修饰符
    String name = "草尼玛";

    // 方法自带抽象方法修饰符
    void speek();
}

interface Interface02 {
    void run();
}

// 定义实现类,实现类就是来实现接口定义的数据类型格式的
class Wcy implements Interface01, Interface02 {
    // 实现类需要实现两个接口,必须要重写方法


    @Override
    public void speek() {
        System.out.println("我是世界第一帅汪");
    }

    @Override
    public void run() {
        System.out.println("时速80迈");
    }
}


// 主函数
public class Main {
    public static void main(String[] args) {
        // 实例化实现类
        // 指定变量变量的类型为接口
        Interface01 one = new Wcy();
        one.speek();
        Interface02 two = new Wcy();
        two.run();
//        two.speek();
    }
}

