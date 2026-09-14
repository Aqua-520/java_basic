package com.wcy.b_flow;

public class Demo06 {
    /**
     * main方法是当前java程序的入口
     *
     * @param args
     */
    public static void main(String[] args) {
        // 在主函数中调用
        int result = add(10, 20);
        System.out.println(result);
    }

    // 定义方法
    public static int add(int a, int b) {
        // 直接返回
        return a + b;
    }
}
