package com.wcy.oop.j_工具类;

public class Demo1 {
    public static void main(String[] args) {
        WcyTools.shuai("汪宸宇");

        // 工具类会被私有化构造函数,无法实例化创建对象
//        WcyTools result = new WcyTools();
    }
}


// 定义工具类
class WcyTools {
    // 将构造函数私有化
    private WcyTools() {
    }

    public static void shuai(String name) {
        System.out.println(name + "哥哥你好帅呀");
    }
}