package com.wcy.数据容器.String;

public class Demo01 {
    public static void main(String[] args) {
        // 字符串的类中,帮我们写了多份构造方法

        byte[] bytes = {
                97, 98, 99, 100
        };
        // 接收字节序列,可以返回一个asc码转的字符串
        String bytesToStr = new String(bytes);
        System.out.println("字节数组转字符串结果是:" + bytesToStr);

        // 还可以传入字符序列
        char[] chars = {
                '我', '超', '爱', '你'
        };
        String charsToStr = new String(chars);
        System.out.println("字符数组转字符串结果是:" + charsToStr);

        // 字面量定义字符串会有一个字符串缓存池机制
        String name01 = "汪宸宇";
        String name02 = "汪宸宇";

        System.out.println(name01 == name02);

        String name03 = new String("汪宸宇");
        System.out.println(name01 == name03);
    }
}
