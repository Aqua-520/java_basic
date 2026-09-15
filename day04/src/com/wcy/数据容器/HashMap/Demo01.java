package com.wcy.数据容器.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Demo01 {
    public static void main(String[] args) {
        // map常用方法
        Map<String, String> myMap = new HashMap<>();

        // 添加元素用put
        myMap.put("我是key1", "袁金牛");
        myMap.put("u02", "吟霖");
        myMap.put("u03", "安可");
        myMap.put("u04", "维里奈");
        myMap.put("u05", "卡卡罗");

        // 集合元素个数
        System.out.println("元素个数：" + myMap.size());
        System.out.println("是否为空：" + myMap.isEmpty());

        // 带默认值的get
        System.out.println("getOrDefault：" + myMap.getOrDefault("key10", "我是默认值"));

        // 根据key获取value
        System.out.println("获取 key1 的值：" + myMap.get("我是key1"));

        // 根据key删除某个元素
        System.out.println("删除 u02：" + myMap.remove("u02"));

        // 判断是否包含某个key或者value
        System.out.println("是否包含key u05：" + myMap.containsKey("u05"));
        System.out.println("是否包含value 袁金牛：" + myMap.containsValue("袁金牛"));

        // 获取所有的key
        System.out.println("所有key：" + myMap.keySet());

        // 获取所有的value
        System.out.println("所有value：" + myMap.values());

        // 获取所有的键值对
        System.out.println("所有键值对：" + myMap.entrySet());

        // 清空
        myMap.clear();
        System.out.println("清空后是否为空：" + myMap.isEmpty());
    }
}