package com.wcy.a_basic;

public class Demo09 {
    public static void main(String[] args) {
        // 条件分支语句
        int score = 110;

        if (score <= 100 && score >= 95) {
            System.out.println("送一台18promax");
        } else if (score < 95 && score >= 90) {
            System.out.println("日本七天旅游");
        } else if (score < 90 && score >= 80) {
            System.out.println("一顿肯德基");
        } else if (score < 80 && score >= 60) {
            System.out.println("奖励黄冈密卷一份");
        } else if (score < 60) {
            System.out.println("不好好考试是吧");
        } else {
            System.out.println("打死你个b");
        }
    }
}
