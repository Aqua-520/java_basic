package com.wcy.数据容器.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Demo05 {
    public static void main(String[] args) {
        // 实例化单列集合对象
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("my name is wcy");

        // 打印单列集合
        System.out.println(list);

        // 泛型必须要是引用数据类型,无法设置为基本数据类型
        // new ArrayList<int();

        // 定义一个可以接收任何元素的单列集合
        ArrayList<Object> any = new ArrayList<>();

        any.add(100);
        any.add("草尼玛");
        any.add(13.14);

        // 打印集合
        System.out.println(any);
    }
}
