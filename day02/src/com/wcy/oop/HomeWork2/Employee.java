package com.wcy.oop.HomeWork2;

class Employee {
    private int id;
    private String name;
    private double baseSalary;


    // get set方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // 构造函数

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // 提供基础方法
    public double calculateSalary() {
        // 返回基本工资
        return this.baseSalary;
    }

    public void showEmployeeInfo() {
        System.out.println("员工基本信息,姓名:" + this.name + "工号:" + this.id + "基本薪资" + this.baseSalary);
    }
}
