package com.wcy.数据容器.String;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        // 登录系统
        Scanner scanner = new Scanner(System.in);

        // 定义循环变量
        int count = 0;

        while (true) {
            // 开启无限循环,来录入用户信息
            System.out.print("请输入用户名");
            String username = scanner.next();
            System.out.print("请输入密码");
            String password = scanner.next();

            // 密码校验
            // 账号和密码限定死
            if (username.equals("itheima") && password.equals("111111")) {
                // 登录正确,打印提示信息
                System.out.println("账号密码输入正确,登陆成功");
                break;
            } else {
                System.out.println("账号密码输入错误");
                // 累加器累加
                count++;

                // 判断是否达到重试上限
                if (count >= 3) {
                    System.out.println("登录次数达到上限");
                    break;
                }
            }
        }


    }
}
