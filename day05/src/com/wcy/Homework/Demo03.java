package com.wcy.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo03 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("张三", 28, 9500, "技术部"));
        employees.add(new Employee("李四", 32, 15000, "技术部"));
        employees.add(new Employee("王五", 45, 18000, "技术部"));
        employees.add(new Employee("赵六", 26, 7500, "市场部"));
        employees.add(new Employee("孙七", 38, 12000, "市场部"));
        employees.add(new Employee("周八", 29, 6800, "市场部"));
        employees.add(new Employee("吴九", 41, 11000, "人事部"));
        employees.add(new Employee("郑十", 33, 9200, "人事部"));
        employees.add(new Employee("陈十一", 27, 13500, "技术部"));
        employees.add(new Employee("林十二", 36, 10500, "人事部"));
        employees.add(new Employee("黄十三", 30, 8800, "财务部"));
        employees.add(new Employee("刘十四", 42, 16000, "财务部"));


        // 筛选出薪资大于 10000 的员工
        // 2）按薪资降序排序
        // 3）跳过前 2 名，取接下来 3 名员工, 并将这 3 名员工的姓名收集到一个新的 List 中并输出

        List<Employee> employees1 = employees.stream().filter(emp -> emp.getSalary() > 10000)
                .skip(2)
                .limit(3)
                .sorted((emp1, emp2) -> Double.compare(emp2.getSalary(), emp1.getSalary()))
                .collect(
                        Collectors.toList()
                );
        employees1.forEach(employee -> System.out.println(employee));
    }
}

class Employee {
    private String name;    // 姓名
    private int age;        // 年龄
    private double salary;  // 工资
    private String dept;    // 部门

    public Employee() {
    }

    public Employee(String name, int age, double salary, String dept) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}