package com.wcy.a_basic;

public class Demo04 {
    public static void main(String[] args) {
        // 演示运算符
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        // 两个int数学计算会取范围最高的类型,做类型转换,当前最高为int,所以小数被取舍掉了
        System.out.println(num1/num2);
        System.out.println(num1%num2);

        float num3 = 10.0F;
        // 自动类型转换为0.5
        System.out.println(num3 / num2);

        // 字符串拼接
        String name = "我是帅汪";
        int age = 18;
        // +号有一边是字符串,直接执行拼接操作,结果是字符串
        System.out.println(name+age);
    }
}
