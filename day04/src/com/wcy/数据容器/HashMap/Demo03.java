package com.wcy.数据容器.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo03 {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();
        list.add(new Order("小王", "咖啡", 10));
        list.add(new Order("小张", "咖啡", 10));
        list.add(new Order("小花", "奶茶", 10));
        list.add(new Order("大壮", "奶茶", 20));
        list.add(new Order("大嘴", "果茶", 22));
        list.add(new Order("大脚", "果茶", 4));
        list.add(new Order("小可爱", "果茶", 3));


        // 统计种类,计数
        Map<String, Integer> goodsMap = new HashMap<>();

        // 循环列表,提取数据
        for (Order order : list) {
            // 先看看map有没有已经记录种类了,如果没有初始值为0
            int count = goodsMap.getOrDefault(order.getCategory(), 0);
            // 直接拼装到map中
            goodsMap.put(order.getCategory(), ++count);
        }
        System.out.println(goodsMap);
    }
}

class Order {
    // 订单下单人
    private String name;
    // 种类
    private String category;
    // 价格
    private double amount;

    public Order() {
    }

    public Order(String name, String category, double amount) {
        this.name = name;
        this.category = category;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", amount=" + amount +
                '}';
    }
}