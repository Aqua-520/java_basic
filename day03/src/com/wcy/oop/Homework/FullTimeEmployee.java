package com.wcy.oop.Homework;

/*
    全职员工类
 */
public class FullTimeEmployee extends Employee {
    // 新增属性,绩效奖金
    private double performanceBonus;

    // 构造函数


    public FullTimeEmployee(String name, double baseSalary, int id, double performanceBonus) {
        super(name, baseSalary, id);
        this.performanceBonus = performanceBonus;
    }

    // 实现计算工资的抽象方法
    @Override
    public double calculateSalary() {
        // 薪资计算规则,基本工资+绩效奖金
        double result = this.getBaseSalary() + this.performanceBonus;
//        System.out.println("当前员工:" + this.getName() + "的工资是:" + result);
        return result;
    }
}
