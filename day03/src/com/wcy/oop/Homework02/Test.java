package com.wcy.oop.Homework02;

import java.util.Random;

public class Test {
    // 测试类,实例化

    public static void main(String[] args) {
        Random random = new Random();
        // 定义商品数组长度
        Product[] products = new NormalProduct[5];

        for (int i = 0; i < products.length; i++) {
            String name = "商品" + (i + 1);
            double price = 5 + random.nextInt(50);       // 5 ~ 54 元
            int quantity = 1 + random.nextInt(20);       // 1 ~ 20 件

            if (i % 2 == 0) {
                // 偶数下标 -> 普通商品
                products[i] = new NormalProduct(name, price, quantity);
            } else {
                // 奇数下标 -> 会员商品，折扣 0.8 ~ 0.9
                double discount = 0.8 + random.nextInt(2) * 0.1; // 0.8 或 0.9
                products[i] = new MemberProduct(name, price, quantity, discount);
            }
        }

        // 循环结束拿到五个商品对象
        new Settlement().settleAccount(products);
    }

}
