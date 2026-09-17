package com.wcy.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo02 {
    public static void main(String[] args) {

        /*
            创建一个类，在main方法中完成如下操作
        1）创建一个集合，存储多个字符串元素{“张三丰”, “张无忌”, “张翠山”, “王二麻子”, “张良”, “谢广坤”,“张三丰”}
        2）使用stream流把集合中重复的元素过滤掉，并进行打印
        3）使用stream流把集合中"张"字开头且长度为3的元素筛选出来，并转成一个set集合遍历输出
         */
        List<String> list = new ArrayList<>(Arrays.asList(
                "张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤", "张三丰"
        ));

        // list.stream().distinct().forEach(name -> System.out.println(name));

        // 使用stream流把集合中"张"字开头且长度为3的元素筛选出来，并转成一个set集合遍历输出
        Set<String> result = list.stream().filter(name -> name.length() == 3 && name.charAt(0) == '张').collect(
                Collectors.toSet()
        );
        result.forEach(name -> System.out.println(name));


    }
}
