package com.wcy.数据容器.String;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        // 包装类转换为基本类型
        String s1 = "1123,12,3,123,12,312,2";

        // 累加字符串里面的数值
        // 按照逗号切分成字符串数组
        String[] strList = s1.split(",");
        System.out.println(Arrays.toString(strList));

        // 累加和
        int sum = 0;

        // 循环遍历数组
        for (String string : strList) {
            // 拿到的每个元素是字符串的数字,调用包装类方法转换成基本数据类型
            int num = Integer.parseInt(string);

            // 拿到数值再进行累加
            sum += num;
        }
        // 打印累加结果
        System.out.println(sum);
    }
}
