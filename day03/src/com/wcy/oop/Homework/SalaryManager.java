package com.wcy.oop.Homework;

/*
    定义管理类
 */
public class SalaryManager {
    // 遍历每个员工工资的薪资总和,然后输出每个员工的信息和薪资
    public void calculateTotalSalary(SalaryCalculable[] employees) {
        // 定义参数,传入一个数组,数组的每个元素必须要实现了这个接口的对象
        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            // 循环拿到每个员工对象
            SalaryCalculable employee = employees[i];

            //  打印员工基本信息
            employee.getEmployeeInfo();
            System.out.println("-------------------------------");
            // 累加当前员工薪资
            totalSalary += employee.calculateSalary();

        }
        // 5. 最后输出总和
        System.out.println("所有员工薪资总和：" + totalSalary);

    }
}
