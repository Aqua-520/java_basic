package com.wcy.a_basic;

public class Demo08 {
    public static void main(String[] args) {
        // 逻辑中断
        int a = 10;

        // 与逻辑中断,前面为true则第二个语句执行
        System.out.println(true && (a++ > 10)); // 输出结果是false,但是a结束完毕会自增1
        System.out.println(a);

        // false, 输出结果是false ,且后续代码不执行
        System.out.println(false && (a++ >= 10)); // a不自增,还是11
        System.out.println(a);

        // 或逻辑中断
        // true则直接返回true,后续代码不执行,也就是a不会自增,还是11
        System.out.println(true || (a++ > 10));
        System.out.println(a);

        // false则返回第二个表达式的结果,并且执行自增,a为12
        System.out.println(false || (a++ > 10));
        System.out.println(a);

    }
}
