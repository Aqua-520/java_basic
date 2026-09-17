package com.wcy.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Demo01 {
    public static void main(String[] args) {
        /*
            定义一个集合中有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，使用stream完成下面需求
            1）将以郭字开头的元素存入新数组，并打印
            2）取出前2个元素并在控制台打印输出
            3）取出后2个元素并在控制台打印输出
            4）统计名字三个字的人数
         */
        List<String> list = new ArrayList<>(Arrays.asList(
                "黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏"
        ));

        // 使用流来处理数据
        // List<String> newList01 = list.stream().filter(name -> name.charAt(0) == '郭')
        //         .toList();

        // 打印
        // for (Object name : newList01) {
        //     System.out.println(name);
        // }

        // 2）取出前2个元素并在控制台打印输出
        // list.stream().skip(0).limit(2).forEach(name -> System.out.println(name));

        // 3）取出后2个元素并在控制台打印输出
        // list.stream().skip(list.size() - 2).forEach(name -> System.out.println(name));

        // 4）统计名字三个字的人数
        list.stream().filter(name -> name.length() == 3).forEach(name -> System.out.println(name));
    }

}
