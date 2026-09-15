package com.wcy.数据容器.Array;

import java.sql.Array;

public class Demo01 {
    public static void main(String[] args) {
        // 长度为3的数组
        int[] arr01 = {
                10, 20, 30
        };

        // new一个字符串类型的[]
        String[] name01 = new String[]{
                "汪宸宇", "黄一个", "贾博文"
        };

        // 先声明数组长度
        // 长度为5的空数组
        String[] name02 = new String[5];

        // 通过索引添加数据
        name02[0] = "你好";
        name02[1] = "草尼玛";
        name02[2] = "我是大帅哥";
        name02[3] = "我要玩原神";
        name02[4] = "哎,好心累";

        for (int i = 0; i < name02.length; i++) {
            System.out.println(name02[i]);

        }
    }
}
