package com.wcy.oop.d_继承;

public class Demo04 {
    public static void main(String[] args) {
        B b = new B();
        b.age = 22;
//        b.name = "caonima";

        System.out.println(b.getAge());
        b.setName("黄一个");
        System.out.println(b.getName());
    }
}

class A {
    // 定义两个属性
    private String name;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class B extends A {
}
