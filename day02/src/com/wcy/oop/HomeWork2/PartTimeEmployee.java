package com.wcy.oop.HomeWork2;

public class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int workHours;

    public PartTimeEmployee(int id, String name, double baseSalary, int workHours, double hourlyWage) {
        super(id, name, baseSalary);
        this.workHours = workHours;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double calculateSalary() {
        return this.hourlyWage * this.workHours + this.getBaseSalary();
    }
}
