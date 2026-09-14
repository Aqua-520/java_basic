package com.wcy.oop.g_案例;

import lombok.Data;

@Data // 自动给每个属性生成get set
class Employee {
    // 定义公有属性
    private String name;
    private int id;
    private double salary;

    public void work() {
        System.out.println("我在工作");
    }

    public Employee() {
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}