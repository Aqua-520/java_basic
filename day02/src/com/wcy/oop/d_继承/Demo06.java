package com.wcy.oop.d_继承;

import java.util.Objects;

public class Demo06 {
    public static void main(String[] args) {
        // 实例化对象
        Father father = new Father("汪宸宇", 18);
        System.out.println(father.toString());

        Son son = new Son("汪宸宇", 18);
        System.out.println(son.equals(father));
    }
}

class Father {
    String name;
    int age;

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 方法重写

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 重写比较方法
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Father other = (Father) obj;
        return age == other.age && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class Son extends Father {
    public Son(String name, int age) {
        super(name, age);
    }


}
