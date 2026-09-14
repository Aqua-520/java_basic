package com.wcy.c_function;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        // 演示用户输入
        // 创建输入对象 System.in表示从键盘输入
        Scanner scannerObj = new Scanner(System.in);

        // 收集用户输入
        System.out.print("请输入姓名:");
        String name = scannerObj.next();

        System.out.print("请输入年龄:");
        byte age = scannerObj.nextByte();

        System.out.print("请输入身高:");
        double height = scannerObj.nextDouble();

        System.out.println("用户输入的姓名是:" + name);
        System.out.println("年龄是:" + age);
        System.out.println("身高是:" + height);
    }
}
