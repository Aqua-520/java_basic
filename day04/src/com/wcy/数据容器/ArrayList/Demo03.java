package com.wcy.数据容器.ArrayList;

import java.util.HashSet;
import java.util.Iterator;

public class Demo03 {
    public static void main(String[] args) {
        // 创建一个set集合
        HashSet<Object> hashSet = new HashSet<>();

        // 添加五个有意思的学生姓名
        hashSet.add("尼古拉斯·赵四");
        hashSet.add("宇智波·翠花");
        hashSet.add("东方不败·小明");
        hashSet.add("灭霸·王二狗");
        hashSet.add("海绵宝宝·铁柱");

        // 遍历,集合无序且没有索引,不能通过索引访问

        // for (Object name : hashSet) {
        //     System.out.println(name);
        // }

        // 通过迭代器
        // Iterator<Object> iterator = hashSet.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        // 通过foreach 传入自定义的函数表达式
        hashSet.forEach(name -> System.out.println(name));
    }
}
