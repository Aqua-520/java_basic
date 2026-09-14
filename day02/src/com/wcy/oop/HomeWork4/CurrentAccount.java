package com.wcy.oop.HomeWork4;

/*
    活期账户类
 */
public class CurrentAccount extends BankAccount {
    // - 新增属性：是否允许透支（isOverdraft，boolean）。
    boolean isOverdraft;

    // 构造器
    public CurrentAccount(String accountNo, double balance, String owner, boolean isOverdraft) {
        super(accountNo, balance, owner);
        this.isOverdraft = isOverdraft;
    }

    // 传入取款金额,方法重写
    @Override
    public void withdraw(double amount) {
        // 非法金额拦截
        if (amount <= 0) {
            System.out.println("取款金额非法");
            return;
        }
        // 如果不能透支且取款额度大于存款,无法取款
        if (!this.isOverdraft && amount > this.getBalance()) {
            System.out.println("余额不足，无法取款");
            return;
        }
        // 使用 updateBalance 绕过父类 setBalance 的负数检查
        this.updateBalance(this.getBalance() - amount);
        System.out.println("取款成功");
    }

    // get,set方法
    public boolean isOverdraft() {
        return isOverdraft;
    }

    public void setOverdraft(boolean isOverdraft) {
        this.isOverdraft = isOverdraft;
    }
}
