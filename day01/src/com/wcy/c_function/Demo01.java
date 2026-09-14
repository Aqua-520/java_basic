package com.wcy.c_function;

public class Demo01 {
    public static void main(String[] args) {
        // 主方法中调用
        int result1 = add(10, 20);
        System.out.println("方法1调用结果是" + result1);

        double result2 = add(10.99, 20);
        System.out.println("方法2调用结果是" + String.format("%.2f", result2));

        int result3 = add(10, 20, 30);
        System.out.println("方法3调用结果是" + result3);
    }

    /*
    本章演示函数重载
    同名的函数,参数类型不同,个数不同,则为函数重载
     */
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
