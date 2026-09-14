package com.wcy.oop.Homework02;

public class Settlement {
    // 结算类
    public void settleAccount(Product[] products) {
        // 商品总价
        double total = 0;

//        输出每个商品的名称和单种商品总价
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //  打印商品信息
            product.getProductName();

            // 打印当前商品总价
            System.out.println("该商品总价：" + product.calculateTotalPrice());

            // 累加价格
            total += product.calculateTotalPrice();

            System.out.println("----------------------");
        }
        // 打印所有商品的总价
        System.out.println("所有商品总价：" + total);
    }
}
