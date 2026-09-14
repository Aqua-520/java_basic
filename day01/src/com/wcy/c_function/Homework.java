package com.wcy.c_function;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        // 第一题
        getSum();
    }

    // 1. 基础编程：使用for循环遍历1~100，计算所有偶数的和，并在控制台输出最终结果
    public static void getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    // 2. 分支练习：定义一个学生分数（0-100），使用if-else if分支实现成绩评级：
    // 90-100优秀、80-89良好、60-79及格、0-59不及格，分数超出范围提示“分数输入错误”
    public static void getScore() {
        // 收集用户分数
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户考试分数:");
        int score = scanner.nextInt();

        // 分支判断
        if (score > 100 || score < 0) {
            // 如果用户分数大于100或者小于0
            System.out.println("用户的分数非法");
        } else if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }

    // 3. 循环跳转编程：使用for循环打印1~50之间的所有数字，
    // 遇到3的倍数跳过不打印，遇到40直接结束循环，熟练运用continue、break关键字
    public static void printToFifty() {
        for (int i = 0; i < 50; i++) {
            if (i % 3 == 0) {
                // 遇到3的倍数跳过不打印
                continue;
            }
            if (i == 40) {
                // 到了40直接结束循环
                break;
            }
            // 校验通过就打印
            System.out.println(i);
        }
    }

    // 自定义方法：定义一个方法，方法能够接收三个整数，然后找出的最小值返回
    public static int getMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    // 5. 方法重载：定义重载方法，分别实现
    // 两个整数求和、两个小数求和、三个整数求和，在main方法中分别调用并输出结果
    public static void getSum2(int a, int b) {
        System.out.println(a + b);
    }

    public static void getSum2(float a, float b) {
        System.out.println(a + b);
    }

    public static void getSum2(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
