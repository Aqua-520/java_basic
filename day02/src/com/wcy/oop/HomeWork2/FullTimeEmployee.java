package com.wcy.oop.HomeWork2;

public class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    // 方法重写


    @Override
    public double calculateSalary() {
        return this.getBaseSalary() + this.bonus;
    }
}
