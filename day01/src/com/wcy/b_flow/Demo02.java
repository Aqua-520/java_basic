package com.wcy.b_flow;

public class Demo02 {
    public static void main(String[] args) {
        // for循环的用法
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println("一百以内的偶数是:" + i);
//            }
//        }

        // 0 - 100以内的累加和是
        int sum = 0;
        for (int j = 1; j <= 100; j++) {
            sum += j;
        }
        System.out.println("一百以内的和是:" + sum);
    }
}
