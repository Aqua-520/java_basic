package com.wcy.oop.f_super;

public class Demo08 {
    public static void main(String[] args) {
        Son2 son2 = new Son2("父亲的名字", "孩子的名字");
        System.out.println(son2);

        Son2 son3 = new Son2("父亲的名字", "孩子的名字", 18);
        System.out.println(son3);
    }
}

class Father2 {
    String name;

    // 父类构造器
    public Father2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Father2{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Son2 extends Father2 {
    String name;
    int age;

    // 第一个构造器赋值父name,还有子name
    public Son2(String parentName, String childName) {
        super(parentName);
        this.name = childName;
    }

    // 构造器重写
    public Son2(String parentName, String childName, int age) {
        this(parentName, childName);
        this.age = age;
    }

    public void show() {
        System.out.println();
        System.out.println(super.name);
    }

    @Override
    public String toString() {
        return "Son2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
