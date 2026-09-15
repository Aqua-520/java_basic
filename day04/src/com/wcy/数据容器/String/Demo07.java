package com.wcy.数据容器.String;

import java.util.ArrayList;

public class Demo07 {
    public static void main(String[] args) {
        // 声明一个单列集合
        ArrayList<String> strList = new ArrayList<>();

        // 学习内置api方法
        strList.add("你好");
        strList.add("我是黄一个");
        strList.add("磊磊最帅");
        System.out.println("添加三个元素后：" + strList);

        // 根据索引在指定位置插入元素
        strList.add(0, "我是被插入到0号位的元素");
        System.out.println("在0号位插入后：" + strList);

        // 将1号位修改成hello
        strList.set(1, "hello");
        System.out.println("把1号位改成hello后：" + strList);

        // 获取指定位置的元素
        String ele = strList.get(1);
        System.out.println("获取1号位元素：" + ele);

        // 是否包含某个元素
        boolean isContains = strList.contains("你好");
        System.out.println("是否包含\"你好\"：" + isContains);

        // 集合中元素个数
        System.out.println("集合中元素个数是:" + strList.size());

        // 移除元素,可以根据元素或者下标匹配
        strList.remove("我是黄一个");
        System.out.println("移除元素\"我是黄一个\"后：" + strList);

        strList.remove(1);
        System.out.println("移除1号位元素后：" + strList);

        // 清空集合
        strList.clear();
        System.out.println("清空集合后：" + strList);
    }
}
