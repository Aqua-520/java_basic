package com.wcy.oop.HomeWork4;

public class BankTest {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("1234567899", 10000, "汪宸宇", 2.75, "2026-09-07");
        CurrentAccount currentAccount = new CurrentAccount("0000000000", 2000, "黄一个", true);
        CurrentAccount currentAccount2 = new CurrentAccount("0000000000", 2000, "黄一个", false);

        savingsAccount.calculateInterest(6);
        currentAccount.withdraw(3000);
        currentAccount2.withdraw(3000);
    }
}
