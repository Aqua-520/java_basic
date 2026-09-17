package com.wcy.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        // 异常捕获
        division(10, 0);

        // 编译时异常需要层层抛出,或内部处理
    }

    private static void division(int i, int i1) throws Exception {
        if (i1 == 0) {
            throw new Exception("除数不能为0");
        }
        System.out.println(i / i1);
    }

    // 编译期异常 : 在程序编译的时候就会报异常(如果不做处理,程序编译不通过)
    public static Date parse(String dateStr) {
        // 将传入的日期字符串转时间对象
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        /*
            因为属于高危操作,字符串格式不能出错,所以parse虽然语法正确
            但是还是得强制要求用try拦截
         */
        // 将时间字符串转化为时间日期对象返回
        // 编译器异常,不处理程序无法编译
        try {
            // try处理异常
            return dateFormat.parse(dateStr);
        } catch (ParseException e) {
            // 如果出现异常,catch捕获,然后抛出一个新的运行时异常
            System.out.println("时间日期格式解析失败,请检查格式");
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally不管怎么样都会运行");
        }
    }
}
