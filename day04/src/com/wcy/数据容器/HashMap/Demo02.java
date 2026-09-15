package com.wcy.数据容器.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();

        // 添加元素用put
        myMap.put("我是key1", "袁金牛");
        myMap.put("u02", "吟霖");
        myMap.put("u03", "安可");
        myMap.put("u04", "维里奈");
        myMap.put("u05", "卡卡罗");

        // 通过foreach循环遍历
        myMap.forEach((key, value) -> {
            System.out.println("key是:" + key + " value是:" + value);
        });

        // 先获得key的集合,然后使用增强for循环拿到
        for (String key : myMap.keySet()) {
            // 通过key取值
            System.out.println("通过key进行取值:" + myMap.get(key));
        }

        // 取出key和value的集合,然后遍历
        Set<Map.Entry<String, String>> entrySet = myMap.entrySet();
        for (Map.Entry<String, String> stringStringEntry : entrySet) {
            String key = stringStringEntry.getKey();
            String value = stringStringEntry.getValue();
            System.out.println("通过key和value集合遍历:" + key + "value是:" + value);
        }
    }
}
