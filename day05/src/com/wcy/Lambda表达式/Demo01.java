package com.wcy.Lambda表达式;

public class Demo01 {
    public static void main(String[] args) {
        // 定义一个lambda,重写只有一个方法的接口,这个接口叫函数式接口
        Face01 face = () -> {
            System.out.println("你好");
        };

        // 调用载体方法
        face.sayhi();

        // 定义变量类型
        Add01 add = (int a, int b) -> {
            // 重写Add01接口中的方法
            return a + b;
        };
        int result = add.add(10, 20);
        System.out.println(result);
    }
}

// 定义只有一个抽象方法的接口
@FunctionalInterface
interface Face01 {
    void sayhi();
}

@FunctionalInterface
interface Add01 {
    int add(int a, int b);
}
