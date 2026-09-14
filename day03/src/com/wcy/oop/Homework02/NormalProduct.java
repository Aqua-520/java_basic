package com.wcy.oop.Homework02;

public class NormalProduct implements Product {
    // 商品名称
    private String name;

    // 商品单价
    private double price;

    // 商品数量
    private int quantity;

    // 全参构造
    public NormalProduct(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void getProductName() {
        System.out.println("商品名称：" + name);
        System.out.println("商品单价：" + price);
        System.out.println("商品数量：" + quantity);
    }

    // 实现 calculateTotalPrice 方法
    @Override
    public double calculateTotalPrice() {
        // 总价 = 单价 × 数量
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


