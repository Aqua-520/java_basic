package com.wcy.b_flow;

public class Demo04 {
    public static void main(String[] args) {
        // 纸张厚度0.1mm,折叠多少次可以达到珠穆朗玛峰厚度

        // 珠峰高度
        double height = 8848000;
        // 纸张厚度
        double thickness = 0.1;

        // 统计次数
        int count = 0;

        while (thickness < height) {
            // 只要纸张厚度小于高度,就一直循环
            // 纸张厚度每次折叠翻倍
            thickness *= 2;
            
            // 次数累加
            count++;
        }

        // 打印折叠次数
        System.out.println("折叠了" + count + "次后达到珠峰高度");
    }
}
