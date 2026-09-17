package com.wcy.Homework;

import java.util.LinkedHashMap;
import java.util.Map;

public class Naicha {
    public static void main(String[] args) {
        // 创建商品数组
        Order[] orders = {
                new Order("小明", "奶茶", 18.00),
                new Order("小红", "果茶", 22.50),
                new Order("小刚", "奶茶", 15.00),
                new Order("小美", "咖啡", 28.00),
                new Order("小强", "果茶", 9.90),
                new Order("小丽", "奶茶", 100.00)
        };
        // 方案1
        OrderReport report = new SimpleOrderReport();
        System.out.println("========== 方案1：基础统计 ==========");
        report.allOrderInfo(orders);
        report.getAvrPrice(orders);

        // 方案2：只切换实现类，上层调用逻辑不变
        report = new AdvancedOrderReport();
        System.out.println("\n========== 方案2：进阶统计 ==========");
        report.allOrderInfo(orders);
        report.getAvrPrice(orders);
    }
}

// 我们采用一个接口,两个实现类来进行完成代码
interface OrderReport {
    // 打印所有订单的明细信息
    void allOrderInfo(Order[] orderList);

    // 计算当日订单的客单价平均值
    void getAvrPrice(Order[] orderList);
}

// 订单类
class Order {
    private String name;
    private String category;
    private double price;

    public Order(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}

// 定义第一个实现类
class SimpleOrderReport implements OrderReport {
    // 实现抽象方法

    @Override
    public void allOrderInfo(Order[] orderList) {
        // 打印当日全部订单完整明细
        if (orderList == null || orderList.length == 0) {
            System.out.println("当日暂无订单");
            return;
        }

        System.out.println("===== 当日订单明细 =====");
        System.out.printf("%-10s %-10s %-10s%n", "顾客昵称", "饮品品类", "实付金额");

        // 循环打印订单
        for (Order order : orderList) {
            System.out.printf("%-10s %-10s %-10.2f%n",
                    order.getName(),
                    order.getCategory(),
                    order.getPrice());
        }
        System.out.println("========================");
    }

    @Override
    public void getAvrPrice(Order[] orderList) {
        // 所有金额计算平均客单价
        if (orderList == null || orderList.length == 0) {
            System.out.println("当日暂无订单，无法计算客单价");
            return;
        }

        double sum = 0;
        for (Order order : orderList) {
            sum += order.getPrice();
        }

        double avg = sum / orderList.length;
        System.out.printf("当日客单价平均值：%.2f 元%n", avg);
    }
}

// 第二个实现类
// 方案2实现类：直接实现 OrderReport 接口
class AdvancedOrderReport implements OrderReport {

    @Override
    public void allOrderInfo(Order[] orderList) {
        if (orderList == null || orderList.length == 0) {
            System.out.println("当日暂无订单");
            return;
        }

        System.out.println("===== 当日订单明细 =====");
        System.out.printf("%-10s %-10s %-10s%n", "顾客昵称", "饮品品类", "实付金额");

        for (Order order : orderList) {
            System.out.printf("%-10s %-10s %-10.2f%n",
                    order.getName(),
                    order.getCategory(),
                    order.getPrice());
        }

        System.out.println("========================");

        // 额外统计各饮品品类的下单数量占比
        Map<String, Integer> countMap = new LinkedHashMap<>();
        for (Order order : orderList) {
            countMap.put(order.getCategory(),
                    countMap.getOrDefault(order.getCategory(), 0) + 1);
        }

        System.out.println("===== 各饮品品类下单数量占比 =====");
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            double ratio = entry.getValue() * 100.0 / orderList.length;
            System.out.printf("%-10s %d 单，占比 %.2f%%%n",
                    entry.getKey(),
                    entry.getValue(),
                    ratio);
        }
        System.out.println("================================");
    }

    @Override
    public void getAvrPrice(Order[] orderList) {
        if (orderList == null || orderList.length == 0) {
            System.out.println("当日暂无订单，无法计算客单价");
            return;
        }

        // 边界判断,方案二计算价格需要剔除最高和最低价格
        // 所以传入的产品不能小于3
        if (orderList.length <= 2) {
            System.out.println("订单数量不足 3 笔，剔除最高和最低后无法计算客单价");
            return;
        }

        // 先定义两个变量来接收初始价格
        double max = orderList[0].getPrice();
        double min = orderList[0].getPrice();

        // 循环不断替换最高和最低价格
        for (Order order : orderList) {
            max = Math.max(max, order.getPrice());
            min = Math.min(min, order.getPrice());
        }

        // 价格总计
        double sum = 0;
        boolean removedMax = false;
        boolean removedMin = false;

        for (Order order : orderList) {
            double price = order.getPrice();

            // 只剔除一笔最高金额订单
            if (!removedMax && price == max) {
                removedMax = true;
                continue;
            }

            // 只剔除一笔最低金额订单
            if (!removedMin && price == min) {
                removedMin = true;
                continue;
            }

            sum += price;
        }

        double avg = sum / (orderList.length - 2);
        System.out.printf("剔除最高价 %.2f 元和最低价 %.2f 元后，客单价平均值：%.2f 元%n",
                max, min, avg);
    }
}
