package com.wcy.a_basic;

public class Demo07 {
    public static void main(String[] args) {
        // 三元表达式
        int score = 55;
        String s = score >= 60 ? "及格" : "不及格";
        System.out.println(s);

        // 获取较大值
        int a = 120;
        int b = 20;
        int result = a > b ? a : b;
        System.out.println(result);
    }
}
