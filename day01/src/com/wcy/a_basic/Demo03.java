package com.wcy.a_basic;

public class Demo03 {
    public static void main(String[] args) {
        // 自动类型转换,小范围变量转大范围会自动转
        byte a1 = 64;
        int a2 = a1;
        System.out.println(a2);

        // char字符类型,会通过ascii码表发生转换
        // char类型会自动转换为int的码点
        char char1 = 'a';
        int a3 = char1;
        System.out.println(a3);

        // 发生数学计算的时候,自动转成最高位的数据类型
        byte s1 = 127;
        short s2 = 1999;
        int s3 = 122334;
        long s4 = 1223341112321L;
        // 定义浮点数
        double s5 = 123.22;

        double result = s1 + s2 + s3 + s4 + s5;
        System.out.println(result);

        // 使用手动类型转换,大范围变小范围要手动转
        int num1 = 100;
        byte num2 = (byte) num1;
        System.out.println(num2);

        // 但是会被丢掉数据精度
        int num3 = 15534;
        byte num4 = (byte) num3;
        System.out.println(num4);
    }
}
