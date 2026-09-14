package com.wcy.oop.h_static关键字;

public class Demo01 {
    public static void main(String[] args) {
        City city01 = new City("武汉");
        City city02 = new City("上海");

        System.out.println(city01.name);
        System.out.println(city02.name);

        System.out.println(city01.biecheng);
        System.out.println(city02.biecheng);

        // 修改静态属性
        city01.biecheng = "欢迎来到大上海";
        // 使用类名访问静态属性
        System.out.println(City.biecheng);
    }
}

class City {
    String name;
    static String biecheng = "草尼玛个斑马";

    public City(String name) {
        this.name = name;
    }
}
