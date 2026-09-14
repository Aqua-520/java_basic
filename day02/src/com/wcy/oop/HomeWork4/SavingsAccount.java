package com.wcy.oop.HomeWork4;

/*
    储蓄账户类
 */
public class SavingsAccount extends BankAccount {
    // 年利率
    private double rate;
    // 开户时间
    // "2026-03-08" 示例
    private String createDate;

    // 构造函数,需要新增rate和创建时间
    public SavingsAccount(String accountNo, double balance, String owner, double rate, String createDate) {
        super(accountNo, balance, owner);
        this.rate = rate;
        this.createDate = createDate;
    }

    // 新增方法,计算利息
    public void calculateInterest(int months) {
        // 直接打印即可
        double result = this.getBalance() * (this.rate / 100) * months / 12.0;
        System.out.printf("利息金额：%.2f%n", result);
    }
}
