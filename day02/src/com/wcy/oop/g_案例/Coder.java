package com.wcy.oop.g_案例;

class Coder extends Employee {
    public Coder() {
    }

    public Coder(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("名字为" + super.getName() + "的程序员,工资为" + super.getSalary() + ",工号为" + super.getId() + ",正在工作");
    }
}
