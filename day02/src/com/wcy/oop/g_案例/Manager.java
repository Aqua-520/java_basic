package com.wcy.oop.g_案例;

class Manager extends Employee {
    // 新增一个属性
    double bonus;

    // 构造函数

    public Manager() {
    }

    public Manager(String name, int id, double saraly, double bonus) {
        super(name, id, saraly);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("名字为" + super.getName() + "的程序员,工资为" + super.getSalary() + ",工号为" + super.getId() + ",正在工作");
    }
}
