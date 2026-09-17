package com.wcy.Stream流;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo03 {
    public static void main(String[] args) {
        // 终结方法

        List<String> nameList = new ArrayList<>();
        nameList.add("杨过");
        nameList.add("小龙女");
        nameList.add("张无忌");
        nameList.add("令狐冲");
        nameList.add("段誉");
        nameList.add("乔峰");
        nameList.add("东方不败");
        nameList.add("金轮法王");
        nameList.add("欧阳峰");
        nameList.add("欧阳克");
        nameList.add("小龙女");

        // nameList.stream()
        //         .forEach(name -> System.out.println("foreach返回void,是一个终结方法"));

        // count,统计元素个数
        long count = nameList.stream().filter(
                name -> name.length() == 3
        ).count();
        System.out.println("满足条件的元素个数是:" + count);

        // toList,将元素采集回单列集合
        List<String> newList = nameList.stream().limit(5).toList();
        System.out.println("返回的新集合:" + newList);

        // 获取流中的第一个元素并返回
        Optional<String> optional = nameList.stream()
                .filter(name -> name.length() == 3)
                .findFirst();

        // 拿到返回结果
        String name = optional.orElse("我是默认值");
        System.out.println(name);

    }
}
