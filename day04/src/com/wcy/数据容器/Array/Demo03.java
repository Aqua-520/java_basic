package com.wcy.数据容器.Array;

public class Demo03 {
    public static void main(String[] args) {
        // 定义数组
        int[] sales = {
                16, 26, 88, 67, 34
        };

        // 定义销售额变量
        int total = 0;

        for (int sale : sales) {
            total += sale;
        }
        // 计算每个人的平均销售额度
        double avg = total * 1.0 / sales.length;
        System.out.println("总销售额:" + total + "万元");
        System.out.println("平均每人的销售额:" + avg + "万元");
    }
}
