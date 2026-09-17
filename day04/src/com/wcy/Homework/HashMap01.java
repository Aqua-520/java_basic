package com.wcy.Homework;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        /*
            定义字符串数组 String[] data = {"语文-90","数学-95","英语-88"}，
            遍历数组，将科目作为键、分数作为值存入HashMap
         */

        // 这是一个字符串定长数组
        String[] data = {"语文-90", "数学-95", "英语-88"};

        HashMap<String, String> hashMap = new HashMap<>();

        // 遍历数组,
        for (String score : data) {
            // 对字符串做切分
            String[] keyAndValue = score.split("-");
            // 获取map的key,
            String key = keyAndValue[0];
            String value = keyAndValue[1];

            hashMap.put(key, value);
        }

        // 打印map
        System.out.println(hashMap);

        // 使用lambda回调实现打印
        hashMap.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
    }
}
