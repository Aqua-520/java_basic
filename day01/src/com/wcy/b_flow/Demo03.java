package com.wcy.b_flow;

public class Demo03 {
    public static void main(String[] args) {
        //  while循环
        int i = 1;
        while (i <= 10) {
            System.out.println("你好世界:" + i);
            i++;
        }

        int j = 1;
        // 打印奇数
        while (j <= 10) {
            if (j % 2 == 0) {
                System.out.println("偶数是:" + j);
            }
            j++;
        }
    }
}
