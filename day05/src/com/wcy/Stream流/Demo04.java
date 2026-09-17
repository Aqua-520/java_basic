package com.wcy.Stream流;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo04 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("杨过");
        nameList.add("小龙女");
        nameList.add("张无忌");
        nameList.add("张无忌");
        nameList.add("张无忌");
        nameList.add("张无忌");
        nameList.add("令狐冲");
        nameList.add("令狐冲");
        nameList.add("段誉");
        nameList.add("段誉");
        nameList.add("段誉");
        nameList.add("乔峰");
        nameList.add("东方不败");
        nameList.add("东方不败");
        nameList.add("金轮法王");
        nameList.add("欧阳峰");
        nameList.add("欧阳克");
        nameList.add("小龙女");

        // 数据采集方法
        // 将流中的数据采集为List集合
        // List<String> collect01 = nameList.stream().collect(
        //         Collectors.toList()
        // );
        // System.out.println(collect01);
        //
        // // 将流中的数据采集为Set集合
        // // set集合无序,不可重复
        // Set<String> collect02 = nameList.stream().collect(
        //         Collectors.toSet()
        // );
        // collect02.forEach(name -> System.out.println(name));

        // 根据姓名对数据进行分组
        // 通过map进行分组,map的key为去重的名字,value为列表,里面又是一个个名字
        // Map<String, List<String>> collect03 = nameList.stream().collect(
        //         Collectors.groupingBy(name -> name)
        // );
        // collect03.forEach((key, value) -> System.out.println(key + " : " + value));
        //
        // 根据姓名对数据进行分组,计算每个姓名出现的数量
        // 分组的第二个参数还可以传计算结果
        Map<String, Long> collect04 = nameList.stream().collect(
                // key为名字,第二个传入方法,累加每个value的次数
                Collectors.groupingBy(name -> name, Collectors.counting())
        );
        collect04.forEach((key, value) -> System.out.println(key + " : " + value));

        // 计算每个姓名的字符串长度
        // Map<Object, Object> collect05 = nameList.stream().distinct().collect(
        //         // key为名字,第二个传入方法,累加每个value的次数
        //         Collectors.toMap(name -> name, name -> name.length())
        // );
        // collect05.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}