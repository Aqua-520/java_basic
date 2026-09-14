package com.wcy.oop.g_案例;

public class Main {
    public static void main(String[] args) {
        // 创建对象
        Manager manager = new Manager("黄一个", 10, 300000.99, 50);

        Coder coder = new Coder("汪宸宇", 50, 18888.99);

        manager.work();
        coder.work();
    }
}
