package com.wcy.Homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SetDelete {
    public static void main(String[] args) {
        // 创建集合
        List<String> phoneList = new ArrayList<>();

        // 添加元素
        phoneList.add("华为手机");
        phoneList.add("小米耳机");
        phoneList.add("华为平板");
        phoneList.add("苹果手机");
        phoneList.add("华为手表");

        // 创建迭代器
        Iterator<String> phoneIterator = phoneList.iterator();

        // 循环迭代器
        while (phoneIterator.hasNext()) {
            // 拿到当前元素
            String currentPhone = phoneIterator.next();
            // 判断是否包含华为
            if (currentPhone.contains("华为")) {
                // 使用迭代器的remove,删除元素
                phoneIterator.remove();
            }
        }
        // 循环结束,打印单列集合
        System.out.println(phoneList);
    }
}
