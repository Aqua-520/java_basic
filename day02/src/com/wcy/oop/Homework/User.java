package com.wcy.oop.Homework;

public class User {
    public static void main(String[] args) {
        VipUser vipUser = new VipUser(
                "wcy123",
                "123456",
                "vip等级100级"
        );
        System.out.println(vipUser);
    }
}


class MyUser {
    private String name;
    private String username;
    private String password;

    // 全参构造函数

    public MyUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

// 子类
class VipUser extends MyUser {
    private String level;

    public VipUser(String username, String password, String level) {
        // 调用父类构造函数,给我子类实例赋值
        super(username, password);
        this.level = level;
    }

    @Override
    public String toString() {
        return "VipUser{" +
                "level='" + level + '\'' +
                '}';
    }
}