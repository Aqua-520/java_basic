package com.wcy.Homework;

import java.util.Scanner;

public class WcyBank {
    /*
        银行卡预设正确取款密码：802314
功能要求：
1. 控制台模拟 ATM 输密码界面，每次让用户输入 6 位数字密码；
2. 密码输入正确，输出：密码验证通过，请选择取款业务，程序直接结束
3. 密码输入错误时，提示错误并告知剩余尝试次数
4. 银行卡最多提供3 次密码输入机会，3 次全部输错后，输出：密码连续错误3次，银行卡已锁定，请前往柜台解锁，程序终止
     */
    public static void main(String[] args) {
        new Bank().atm();
    }
}

class Bank {
    // 正确密码
    private static final String PASSWORD = "802314";
    // 最大重试次数
    private static final int MAX_TRY = 3;
    // 键盘录入对象
    private static Scanner scanner = new Scanner(System.in);

    public Bank() {
    }


    public void atm() {
        System.out.println("请输入6位数字密码：");

        // 用 errorCount 记录错误次数
        int errorCount = 0;

        while (errorCount < MAX_TRY) {
            // 用户输入
            String userInput = scanner.next();

            if (PASSWORD.equals(userInput)) {
                System.out.println("密码验证通过，请选择取款业务");
                // 关闭输入对象
                scanner.close();
                // 验证通过，直接结束
                return;
            } else {
                errorCount++;
                int remain = MAX_TRY - errorCount;
                if (remain > 0) {
                    System.out.println("密码输入错误，还剩 " + remain + " 次机会");
                    System.out.println("请输入6位数字密码：");
                }
            }
        }
        // 循环结束说明 3 次都错了
        System.out.println("密码连续错误3次，银行卡已锁定，请前往柜台解锁");
        scanner.close();
    }
}