package com.wcy.数据容器.HashMap;

import java.util.HashMap;

public class Demo04 {
    public static void main(String[] args) {
        // 定义一个字符类型数组
        String[] bookArr = {"《红楼梦》-曹雪芹", "《西游记》-吴承恩", "《三国演义》-罗贯中", "《水浒传》-施耐庵"};

        // 将书名作为key,作者作为value存入map中

        HashMap<String, String> hashMap = new HashMap<>();

        // 循环字符数组
        for (String book : bookArr) {
            // book做字符串切割,切割成新数组
            String[] bookSplitResult = book.split("-");
            hashMap.put(
                    bookSplitResult[0],
                    bookSplitResult[1]
            );
        }
        // 打印成品map
        System.out.println(hashMap);
    }
}
