package com.wcy.oop.Homework;

abstract public class Employee implements SalaryCalculable {
    // 定义抽象父类
    private String name;
    private int id;
    private double baseSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // 构造函数

    public Employee(String name, double baseSalary, int id) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.id = id;
    }

    // 实现接口方法：打印员工信息
    @Override
    public void getEmployeeInfo() {
        System.out.println("姓名：" + name);
        System.out.println("工号：" + id);
        System.out.println("基本工资：" + baseSalary);
    }

    // 抽象类在关联一个接口的时候,可以选择不实现里面的方法,交给子类去实现
}
