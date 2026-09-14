package com.wcy.oop.实现接口;

public class Demo03 {
    public static void main(String[] args) {
        Test02 test = new Test02();

        // 实现类实例
        // 实现类如果没有重写这个默认方法，那么调用时就会使用接口里提供的默认实现。
        test.fn02();
        // 接口的静态方法使用接口名调用
        Test01.fn03();
    }
}

// 实现接口中的私有方法,默认方法,静态方法

interface Test01 {
    // 私有方法
    private void fn01() {
        System.out.println("我是私有方法,接口的私有方法执行了");
    }

    //  默认方法
    default void fn02() {
        //  调用私有方法
        fn01();

        // 默认方法
        System.out.println("接口的默认方法执行了");
    }

    //  静态方法
    static void fn03() {
        System.out.println("接口中的静态方法执行");
    }
}

// 实现类
class Test02 implements Test01 {

}