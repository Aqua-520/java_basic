package com.wcy.数据容器.String;

public class Demo04 {
    public static void main(String[] args) {
        // 通过stringBuilder 构建字符串拼接

        StringBuilder sb = new StringBuilder();

        sb.append("你好").append(",我是黄一个").append(",我今年三岁了");

        // 字符序列转字符串对象
        System.out.println(sb.toString());

        // 字符反转
        System.out.println(sb.reverse());

        // 获取字符序列长度
        System.out.println(sb.length());
    }
}
