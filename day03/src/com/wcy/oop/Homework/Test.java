package com.wcy.oop.Homework;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        SalaryCalculable[] employees = new SalaryCalculable[10];

        for (int i = 0; i < employees.length; i++) {
            // 十位员工
            String name = "员工" + (i + 1);

            // id随便吧,从1001开始累加
            int id = 1001 + i;

            if (i % 2 == 0) {
                // 偶数下标 -> 全职员工
                double baseSalary = 5000 + random.nextInt(5000);      // 5000 ~ 9999
                double performanceBonus = 1000 + random.nextInt(3000); // 1000 ~ 3999
                employees[i] = new FullTimeEmployee(name, baseSalary, id, performanceBonus);
            } else {
                // 奇数下标 -> 兼职员工
                double baseSalary = 0;                                 // 兼职基本工资给 0
                double workHours = 40 + random.nextInt(60);            // 40 ~ 99 小时
                double hourlyRate = 30 + random.nextInt(70);           // 30 ~ 99 元/小时
                employees[i] = new PartTimeEmployee(name, baseSalary, id, workHours, hourlyRate);
            }
        }
        // 创建薪资管理系统对象
        SalaryManager manager = new SalaryManager();
        // 传入十位员工
        manager.calculateTotalSalary(employees);
    }
}
