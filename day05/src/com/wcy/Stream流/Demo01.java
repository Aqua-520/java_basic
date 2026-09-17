package com.wcy.Stream流;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Demo01 {
    public static void main(String[] args) {
        // 创建单列集合
        ArrayList<String> list01 = new ArrayList<>();
        list01.add("草尼玛1");
        list01.add("草尼玛2");
        list01.add("草尼玛3");
        list01.add("草尼4");
        list01.add("草尼玛5");

        // 获取Stream流对象
        Stream<String> stream01 = list01.stream();

        // 创建数组
        String[] arr = {"张三", "李四", "王五", "赵六", "孙七", "周八", "吴九", "郑十"};

        // 通过数组方法获取流
        Stream<String> stream02 = Arrays.stream(arr);

        // 通过Stream对象的of
        Stream<String> stream03 = Stream.of(arr);


    }
}


