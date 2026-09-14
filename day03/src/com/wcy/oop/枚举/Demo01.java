package com.wcy.oop.枚举;

import lombok.Data;

public class Demo01 {
    public static void main(String[] args) {
        // 实例化学生对象
        Student student = new Student("汪宸宇", 18, Sex.MAN);

//        student实例身上有枚举属性
        Sex sex = student.getSex();
        int code = sex.getCode();
        String description = sex.getDesc();
        System.out.println(code + description);
    }
}


// 定义枚举类
enum Sex {
    // 定义枚举类的对象
    MAN("男", 0), WOMAN("女", 1);

    // 定义私有属性,代表上面定义的枚举对象有哪些属性
    private int code;
    private String desc;

    // 定义构造函数,给Sex类,让构造函数给枚举对象进行

    Sex(String desc, int code) {
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public int getCode() {
        return code;
    }
}

@Data
class Student {
    private String name;
    private int age;
    // 性别类型为枚举
    private Sex sex;


    public Student(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}