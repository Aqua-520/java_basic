package com.wcy.匿名内部类;

public class Demo01 {
    public static void main(String[] args) {
        // 不定义实现类,直接实例化
        Hello helloObj = new Hello() {
            @Override
            public void sayHi() {
                System.out.println("你好,我是匿名内部类");

            }
        };

        // 直接调用方法
        helloObj.sayHi();

        // new 抽象类
        Hello2 hello2 = new Hello2() {
            @Override
            void sayHi() {
                System.out.println("我是匿名内部类继承抽象类重写");
            }
        };
    }
}

// 定义接口
interface Hello {
    void sayHi();
}

// 抽象类
abstract class Hello2 {
    abstract void sayHi();
}
