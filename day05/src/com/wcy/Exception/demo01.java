package com.wcy.Exception;

import java.text.SimpleDateFormat;
import java.util.Date;

public class demo01 {
    public static void main(String[] args) {
        // 运行时异常
        System.out.println(myZero(10, 0));
    }

    // 运行时,除零异常
    private static int myZero(int i, int i1) {
        return i / i1;
    }

    // 编译期异常 : 在程序编译的时候就会报异常(如果不做处理,程序编译不通过)
    public static Date parse(String dateStr) throws Exception {
        // 将传入的日期字符串转时间对象
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        /*
            因为属于高危操作,字符串格式不能出错,所以parse虽然语法正确
            但是还是得强制要求用try拦截
         */
        // 将时间字符串转化为时间日期对象返回
        return dateFormat.parse(dateStr); // 编译器异常,不处理程序无法编译
    }
}
