package com.wcy.oop.f_super;

public class Demo07 {
    public static void main(String[] args) {
        Son son = new Son();

        son.show();
    }
}

class Father {
    String name = "老汪";


}

class Son extends Father {
    String name = "小汪";

    public void show() {
        System.out.println(this.name);
        System.out.println(super.name);
    }
}