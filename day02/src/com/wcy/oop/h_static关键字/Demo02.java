package com.wcy.oop.h_static关键字;

public class Demo02 {
    public static void main(String[] args) {
        // 创建对象
        Wcy wcy = new Wcy();

        // 打印实例方法
        wcy.name = "汪宸宇";
        // 对象修改静态属性不推荐
        wcy.schoolName = "武汉黑马程序员";

        wcy.show();
        // 对象调静态方法不推荐
        wcy.showSchoolName();

        // 通过类名调用静态方法
        Wcy.showSchoolName();
    }
}

class Wcy {
    String name;
    static String schoolName;

    // 实例方法
    public void show() {
        System.out.println("大家好我是:" + this.name + "我在" + schoolName + "学习智能应用开发");
    }

    // 静态方法,静态方法属于类
    public static void showSchoolName() {
        // 静态方法无法使用实例属性,只能访问静态属性
        System.out.println("我的学习机构是:" + schoolName);
    }
}
