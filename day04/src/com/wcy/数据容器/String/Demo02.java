
package com.wcy.数据容器.String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        // 声明字符串,测试字符串的内置方法
        String str = "hello world hello python hello java";

        // 字符串长度,通过内置的方法来获取
        int strLength = str.length();
        System.out.println("字符串长度为:" + strLength);

        // 获取指定索引位置的字符
        char charAt = str.charAt(6);
        System.out.println("5号下标的字符是:" + charAt);

        // 将字符串转换为字符数组
        char[] charArr = str.toCharArray();
        // 调用工具函数,将字符数组转成字符串的形式打印
        System.out.println("转换后的字符数组是" + Arrays.toString(charArr));

        // 判断当前字符串与另一个字符串的内容是否一样
        boolean isEquals = str.equals("草尼玛");
        System.out.println("判断内容是否一致的结果是:" + isEquals);

        // 判断忽略大小写的内容是否一致
        boolean isEquals2 = str.equalsIgnoreCase("Hello WORLD");
        System.out.println("判断内容是否一致的结果是:" + isEquals2);

        // 字符串截取,从开始索引截取到最后
        String subStr1 = str.substring(5);
        System.out.println("从指定开始索引截取到最后的结果是:" + subStr1);

        // 指定开始和结束索引
        String subStr2 = str.substring(0, 5);
        System.out.println("从指定开始索引截取到 指定结束索引 的结果是:" + subStr2);

        // 字符串,子串替换,默认是替换全部匹配上的
        String replace1 = str.replace("hello", "我是世界第一帅汪");
        System.out.println("子串替换的结果为:" + replace1);

        // 字符串,子串替换,只替换第一个匹配的
        String replace2 = str.replaceFirst("hello", "我是世界第一帅汪");
        System.out.println("子串替换,只替换第一个匹配的结果:" + replace2);

        // 判断是否包含某个字符串
        boolean isContains = str.contains("java");
        System.out.println("是否包含某个字符串的结果是:" + isContains);

        // 判断是否以某子串开头或者结尾
        boolean isStartWith = str.startsWith("hello");
        System.out.println("判断是否以某子串开头或者结尾的结果是:" + isStartWith);

        // 是否以某个子串结尾
        boolean isEndWith = str.endsWith(".pdf");
        System.out.println("判断是否以某子串开头或者结尾的结果是:" + isEndWith);

        // 按照指定内容做切分,放入数组中
        String[] splitResult = str.split(" ");
        System.out.println("按照指定内容做切分,放入数组中的结果是:" + Arrays.toString(splitResult));
    }
}
