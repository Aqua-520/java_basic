package com.wcy.oop.HomeWork4;

public class BankAccount {
    private String accountNo;
    private double balance;
    // 开户人姓名
    private String owner;


    public BankAccount(String accountNo, double balance, String owner) {
        if (balance <= 0) {
            throw new RuntimeException("余额不能为0且不能为负数");
        }
        this.setAccountNo(accountNo);
        this.balance = balance;
        this.owner = owner;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        // 需要校验,长度必须为10为,且全部为数字,否则设置为十个0
        if (accountNo != null && accountNo.matches("\\d{10}")) {
            this.accountNo = accountNo;
        } else {
            System.out.println("账户编号必须10位,且全部为数字");
            this.accountNo = "0000000000";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        // 设置金钱
        if (balance < 0) {
            System.out.println("余额不能为负数");
            return;
        }
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        // 开户人名称
        this.owner = owner;
    }

    // 存款
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("存款金额非法");
            return;
        }
        this.balance += amount;
        System.out.println("存款成功");
    }

    // 取款
    public void withdraw(double amount) {
        if (amount <= 0 || amount > this.balance) {
            System.out.println("取款金额非法");
            return;
        }
        this.balance -= amount;
        System.out.println("取款成功");
    }

    // 显示账户信息
    public void showInfo() {
        System.out.println("账户编号：" + this.accountNo);
        System.out.println("开户人：" + this.owner);
        System.out.println("账户余额：" + this.balance);
    }

    // 新增：供子类直接修改余额，包括负数（透支场景）
    protected void updateBalance(double balance) {
        this.balance = balance;
    }
}
