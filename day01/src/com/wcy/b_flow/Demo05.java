package com.wcy.b_flow;

public class Demo05 {
    // break 和continue 中断循环
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // 循环中断
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // continue
        for (int i = 0; i < 10; i++) {
            // 循环中断
            if (i == 5) {
                continue;
            }
            System.out.println("continue版本:" + i);
        }
    }
}
