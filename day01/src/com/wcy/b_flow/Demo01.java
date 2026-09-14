package com.wcy.b_flow;

public class Demo01 {
    public static void main(String[] args) {
        // switch分支语句
        int month = 3;

        // 老版本写法
        switch (month) {
            case 1, 2, 3:
                System.out.println("春天");
                break;
            case 4, 5, 6:
                System.out.println("夏天");
                break;
            case 7, 8, 9:
                System.out.println("秋天");
                break;
            case 10, 11, 12:
                System.out.println("冬天");
                break;
        }

        // 新版,单行执行写法
        switch (month) {
            case 1, 2, 3 -> System.out.println("春天");
            case 4, 5, 6 -> System.out.println("夏天");
            case 7, 8, 9 -> System.out.println("秋天");
            case 10, 11, 12 -> {
                System.out.println("冬天");
            }
            default -> {
                System.out.println("无效的月份");
            }
        }

        // 新版,返回值写法
        String result = switch (month) {
            case 1, 2, 3 -> "春天";
            case 4, 5, 6 -> "夏天";
            case 7, 8, 9 -> "秋天";
            case 10, 11, 12 -> "冬天";
            default -> "无效的月份";
        };
        System.out.println(result);
    }
}
