package com.wcy.oop.Homework;

public class ReWrite {
    public static void main(String[] args) {
        // 创建猫狗
        System.out.println(new Dog("小狗", 7, "杜宾"));
        System.out.println(new Cat("哈基米", 2, "蓝白"));
    }
}


class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// 继承
class Cat extends Animal {
    String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}

class Dog extends Animal {
    String pingZhong;

    public Dog(String name, int age, String pingZhong) {
        super(name, age);
        this.pingZhong = pingZhong;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "pingZhong='" + pingZhong + '\'' +
                "} " + super.toString();
    }
}


