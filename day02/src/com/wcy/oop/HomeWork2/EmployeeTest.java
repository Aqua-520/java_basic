package com.wcy.oop.HomeWork2;

public class EmployeeTest {
    public static void main(String[] args) {
        FullTimeEmployee wcy = new FullTimeEmployee(10, "汪宸宇", 18000, 3000);
        System.out.println(wcy.calculateSalary());

        PartTimeEmployee hyg = new PartTimeEmployee(20, "黄一个", 3000, 4, 12.7);
        System.out.println(hyg.calculateSalary());
    }
}
