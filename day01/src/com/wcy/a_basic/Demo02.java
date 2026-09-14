package com.wcy.a_basic;

public class Demo02 {
    public static void main(String[] args) {
        // java当中最小执行单元是类方法,必须要固定写这样的格式

        // 实现字面量写法
        byte age = 18;
        System.out.println(age);

        short s = 18999;
        System.out.println(s);

        // int类型
        int i = 1899999999;
        System.out.println(i);

        // long长整数
        // java中数值字面量默认是int类型,需要加L标识为长整数
        long l = 189999999999999L;
        System.out.println(l);

        // 小数字面量默认是double,双精度浮点数,需要加F标识为单精度浮点数
        float f = 189.22F;
        System.out.println(f);

        // 双精度
        double d = 10.22222;
        System.out.println(d);

        // 字符类型
        char c = '汪';
        System.out.println(c);

        // 布尔类型
        boolean isOk = false;
        System.out.println(isOk);

        // 在java中字符串为引用数据类型,是一种对象
        String name = "我是无敌帅汪";
        System.out.println(name);

        // 给变量重新赋值为新的地址
        name = "我是超级帅黄";
        System.out.println(name);
    }
}
