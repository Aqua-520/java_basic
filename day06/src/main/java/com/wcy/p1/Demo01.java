package com.wcy.p1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Demo01 {
    public static void main(String[] args) {
        Human human = new Human("你好", 17);

        System.out.println(human.getName());
    }
}

// 直接使用@修饰符
@Data
@AllArgsConstructor
@NoArgsConstructor
class Human {
    private String name;
    private Integer age;
}
