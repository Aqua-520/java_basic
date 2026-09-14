package com.wcy.oop.实现接口;

public class Animals {
    public static void main(String[] args) {
        // 使用接口来定义变量类型
        Swim dog = new Dog("杜宾犬", "金色");
        dog.swimming();
        Swim frog = new Frog("蟾蜍", "绿色");
        frog.swimming();

        // 想使用eat,类型得定义成Animal
        Animal cat = new Cat("布偶", "灰色");
        cat.eat();
    }
}

// 定义接口游泳
interface Swim {
    // 抽象方法游泳
    void swimming();
}

// 定义父类
abstract class Animal {
    // 私有属性
    private String breed;
    private String color;

    public Animal(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 抽象方法
    public abstract void eat();
}

// 实现接口
class Dog extends Animal implements Swim {
    public Dog(String breed, String color) {
        super(breed, color);
    }

    // 重写方法
    @Override
    public void eat() {
        System.out.println("狗吃屎");
    }

    // 实现接口中的方法
    public void swimming() {
        System.out.println(this.getColor() + "色的" + this.getBreed() + "品种小狗正在游泳");
    }
}

class Cat extends Animal {
    public Cat(String breed, String color) {
        super(breed, color);
    }

    // 重写方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class Frog extends Animal implements Swim {
    public Frog(String breed, String color) {
        super(breed, color);
    }

    // 重写方法
    @Override
    public void eat() {
        System.out.println("青蛙吃蚊子");
    }

    public void swimming() {
        System.out.println("青蛙正在蛙泳");
    }
}

class sheep extends Animal {
    public sheep(String breed, String color) {
        super(breed, color);
    }

    // 重写方法
    @Override
    public void eat() {
        System.out.println("羊吃草");
    }
}