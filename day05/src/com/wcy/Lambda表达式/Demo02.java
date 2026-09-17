package com.wcy.Lambda表达式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Demo02 {
    public static void main(String[] args) {
        // 实例化订单
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order("漩涡鸣人", "一乐拉面", 10, 1));
        orderList.add(new Order("宇智波佐助", "一乐拉面", 10, 2));
        orderList.add(new Order("灰原哀", "APTX4869特调", 15, 3));
        orderList.add(new Order("路飞", "肉肉肉盖饭", 20, 20));
        orderList.add(new Order("漩涡鸣人", "一乐拉面", 10, 5));
        orderList.add(new Order("灶门炭治郎", "祢豆子便当", 15, 1));
        orderList.add(new Order("路飞", "肉肉肉盖饭", 20, 2));
        orderList.add(new Order("宇智波佐助", "一乐拉面", 10, 3));
        orderList.add(new Order("漩涡鸣人", "一乐拉面", 10, 4));
        orderList.add(new Order("灰原哀", "APTX4869特调", 15, 5));
        orderList.add(new Order("灶门炭治郎", "祢豆子便当", 15, 6));

        // // 订单排序
        // orderList.sort(
        //         // 这里需要传一个接口的继承实现对象
        //         new Comparator<Order>() {
        //             // @Override
        //             // public int compare(Order o1, Order o2) {
        //             //     return Double.compare(o1.getAmount(), o2.getAmount());
        //             // }
        //
        //             @Override
        //             public int compare(Order order01, Order order02) {
        //                 // 返回结果
        //                 return order01.getCount() - order02.getCount();
        //             }
        //         }
        // );

        // lambda订单排序
        orderList.sort((o1, o2) -> o1.getCount() - o2.getCount());


        // 移除
        orderList.removeIf(order -> Objects.equals(order.getNickname(), "漩涡鸣人"));

        orderList.forEach(order -> System.out.println(order));
    }
}


// 订单类
@Data
@NoArgsConstructor
@AllArgsConstructor
class Order {
    String nickname;
    String category;
    double amount;
    int count;
}