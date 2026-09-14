package com.wcy.oop.Homework02;

public class MemberProduct extends NormalProduct {
    // 实现类必须实现两个方法
    // 会员折扣（比如 0.9 表示 9 折）
    private double discount;

    // 全参构造函数
    public MemberProduct(String name, double price, int quantity, double discount) {
        super(name, price, quantity);
        this.discount = discount;
    }

    // 重写两个方法
    // 实现 getName：打印商品信息
    @Override
    public void getProductName() {
        System.out.println("商品名称：" + this.getName());
        System.out.println("商品单价：" + this.getPrice());
        System.out.println("商品数量：" + this.getQuantity());
        System.out.println("会员折扣：" + discount);
    }

    // 重写计算总价：单价 × 数量 × 折扣
    @Override
    public double calculateTotalPrice() {
        return this.getPrice() * this.getQuantity() * discount;
    }
}
