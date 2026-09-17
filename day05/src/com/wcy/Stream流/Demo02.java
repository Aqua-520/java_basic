package com.wcy.Stream流;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo02 {
    public static void main(String[] args) {
        String[] arr = {"张三", "李四", "王五", "赵六", "孙七", "周八", "吴九", "郑十"};

        // 定义一个单列集合
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

        // 创建流对象
        // 过滤名字小于3位数的
        // nameList.stream().filter(name -> name.length() >= 3)
        //         .forEach(name -> System.out.println(name));

        // 从开头取几个
        // nameList.stream().limit(5).forEach(name -> System.out.println(name));

        // 分页
        // nameList.stream().skip(4).limit(5).forEach(name -> System.out.println(name));

        // 去重
        // nameList.stream().distinct().forEach(name -> System.out.println(name));

        // 排序
        // nameList.stream().sorted((o1, o2) -> o2.length() - o1.length()).forEach(name -> System.out.println(name));

        // concat,流拼接
        // Stream.concat(nameList.stream(), Arrays.stream(arr))
        //         .sorted((o1, o2) -> o1.length() - o2.length())
        //         .forEach(name -> System.out.println(name));\

        // 修改流数据
        // nameList.stream().map(name -> name.length())
        //         .sorted()
        //         .forEach(name -> System.out.println(name));


        String[][] usernames = {
                {"张三", "李四", "王五"},
                {"赵六", "孙七", "周八"},
                {"吴九", "郑十", "王十一"}
        };
        // 扁平化
        Arrays.stream(usernames).flatMap(sonArr -> Arrays.stream(sonArr))
                .forEach(name -> System.out.println(name));
    }
}
