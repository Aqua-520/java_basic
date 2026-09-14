package com.wcy.oop.Homework;

// 定义兼职员工类
public class PartTimeEmployee extends Employee {
    // 新增属性
    // 工作时长（小时）
    private double workHours;

    // 每小时报酬（时薪）
    private double hourlyRate;

    //  全参构造函数
    public PartTimeEmployee(String name, double baseSalary, int id, double workHours, double hourlyRate) {
        super(name, baseSalary, id);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    // 实现抽象方法
    @Override
    public double calculateSalary() {
        // 薪资计算规则,工作小时数 * 每小时报酬
        double result = this.getBaseSalary() + this.workHours * this.hourlyRate;
//        System.out.println("当前员工:" + this.getName() + "的工资是:" + result);
        return result;
    }
}
