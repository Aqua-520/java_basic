package com.wcy.Homework;

public class ArrayList {
    public static void main(String[] args) {
        /*
        创建String类型ArrayList集合，添加元素："苹果"、"香蕉"、"橙子"、"葡萄"
        完成修改第二个元素为"芒果"、删除第一个元素、
        判断是否包含"橙子"、输出集合长度的操作
         */
        // 声明集合对象
        java.util.ArrayList<String> fruits = new java.util.ArrayList<>();

        // 添加元素
        fruits.add("苹果");
        fruits.add("香蕉");
        fruits.add("橙子");
        fruits.add("葡萄");

        // 修改第二个元素为芒果
        fruits.set(1, "芒果果");

        // 删除第一个元素
        fruits.removeFirst();

        // 判断是否包含橙子
        if (fruits.contains("橙子")) {
            System.out.println("包含橙子");
        }

        // 输出长度
        System.out.println(fruits.size());

        System.out.println(fruits);
    }
}
