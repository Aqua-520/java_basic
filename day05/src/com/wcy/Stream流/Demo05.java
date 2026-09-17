package com.wcy.Stream流;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Product {
    private String name; // 商品名称
    private double price; // 商品价格
    private Integer stock; // 商品库存
    private Integer sales; // 商品销量
    private String category; // 商品分类
    private double rating; // 商品评分
}

public class Demo05 {
    public Demo05() {
        super();
    }

    public static void main(String[] args) {
        // 构造真实商品数据列表(10个商品)
        List<Product> products = List.of(
                new Product("iPhone 15 Pro", 8999.00, 120, 356, "手机数码", 4.9),
                new Product("华为 Mate 60", 6499.00, 200, 480, "手机数码", 4.8),
                new Product("小米14 Ultra", 5999.00, 150, 290, "手机数码", 4.7),
                new Product("联想小新Pro16", 5299.00, 80, 145, "电脑办公", 4.6),
                new Product("MacBook Air M3", 8499.00, 60, 98, "电脑办公", 4.9),
                new Product("戴尔XPS 13", 7899.00, 45, 67, "电脑办公", 4.5),
                new Product("索尼WH-1000XM5", 2299.00, 300, 520, "影音娱乐", 4.8),
                new Product("AirPods Pro 2", 1899.00, 400, 680, "影音娱乐", 4.7),
                new Product("大疆Osmo Pocket 3", 3499.00, 90, 130, "摄影摄像", 4.6),
                new Product("佳能EOS R6 Mark II", 15999.00, 25, 18, "摄影摄像", 4.9)
        );

        // 使用stream流完成如下需求
        // 1. 打印所有商品详情
        // test01(products);
        // 2. 获取评分最高的前3个商品并打印
        // test2(products);
        // 3. 获取销量最高的前3个商品
        // test3(products);
        // 4. 获取价格大于5000且评分高于4.8分的商品信息
        // test4(products);
        // 5. 获取手机数码分类下评分高于4.8分的商品信息
        // test5(products);
        // 6. 获取销量大于100且价格高于5000且评分低于4.8分的商品名称
        // test6(products);
        // 7. 获取所有的分类名称(去重)
        // test7(products);
        // 8. 获取有商品销量大于100的分类名称以及分类下商品的总销量
        // test8(products);
        // 9. 计算所有商品的总销量
        // test9(products);
        // 10. 计算每个分类下的商品总销量
        // test10(products);
        // 11. 获取库存低于100,且销量高于100的商品信息
        // test11(products);
        // 12. 计算所有商品的平均价格
        // test12(products);
        // 13. 计算每个分类下的商品平均价格
        // test13(products);
        // 14. 计算每个分类下商品的平均评分
        test14(products);


    }

    private static void test14(List<Product> products) {
        //  计算每个分类下商品的平均评分
        Map<String, Double> collect = products.stream()
                .collect(
                        Collectors.groupingBy(product -> product.getCategory(), Collectors.averagingDouble(product -> product.getRating()))
                );
        collect.forEach((category, avrRating) -> System.out.println(category + " : " + avrRating));
    }

    private static void test13(List<Product> products) {
        // 计算每个分类下的商品平均价格
        Map<String, Double> collect = products.stream()
                .collect(
                        // 按照分类分组
                        Collectors.groupingBy(product -> product.getCategory(),
                                // 计算每个分类的平均价格
                                Collectors.averagingDouble(product -> product.getPrice()))
                );
        collect.forEach((category, avgPrice) -> System.out.println(category + " : " + avgPrice));
    }

    private static void test12(List<Product> products) {
        //  计算所有商品的平均售价价格
        // Map<String, Double> collect = products.stream()
        //         .collect(
        //                 Collectors.groupingBy(product -> product.getName(), Collectors.averagingDouble(product -> product.getPrice()))
        //         );
        // collect.forEach((category, avgPrice) -> System.out.println(category + " : " + avgPrice));
        double result = products.stream().mapToDouble(product -> product.getPrice())
                .average().orElse(0.0);

        System.out.println("平均价格是:" + result);

    }

    private static void test11(List<Product> products) {
        // 获取库存低于100,且销量高于100的商品信息
        products.stream()
                .filter(product -> product.getStock() < 100 && product.getSales() > 100)
                .forEach(product -> System.out.println(product));
    }

    private static void test10(List<Product> products) {
        // 计算每个分类下的商品总销量
        Map<String, Integer> collect = products.stream()
                .collect(
                        Collectors.groupingBy(product -> product.getCategory(), Collectors.summingInt(product -> product.getSales()))
                );
        collect.forEach((category, sales) -> System.out.println(category + " : " + sales));
    }

    private static void test9(List<Product> products) {
        // 计算所有商品的总销量
        int sum = products.stream()
                // 先将每个产品的字段提取放到流中,变成了int类型的列表,然后直接用sum累加即可
                .mapToInt(product -> product.getSales())
                .sum();
        System.out.println("总销量:" + sum);
    }

    private static void test8(List<Product> products) {
        Map<String, Integer> collect = products.stream()
                .filter(product -> product.getSales() > 100)
                .collect(
                        // 按照种类分组
                        Collectors.groupingBy(product -> product.getCategory(),
                                // 分类值计算每个分类下的销量
                                Collectors.summingInt(product -> product.getSales()))
                );
        collect.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    private static void test7(List<Product> products) {
        // 获取所有的分类名称(去重)
        products.stream()
                // 先将对象清洗成分类
                .map(product -> product.getCategory())
                .distinct()
                .forEach(p -> System.out.println(p));
    }

    private static void test6(List<Product> products) {
        // 获取销量大于100且价格高于5000且评分低于4.8分的商品名称
        products.stream()
                .filter(product -> product.getSales() > 100 && product.getPrice() > 5000 && product.getRating() < 4.8)
                .forEach(product -> System.out.println(product));
    }

    private static void test5(List<Product> products) {
        // 获取手机数码分类下评分高于4.8分的商品信息
        products.stream()
                .filter(product -> product.getCategory().equals("手机数码") && product.getRating() > 4.8)
                .forEach(product -> System.out.println(product));
    }

    private static void test4(List<Product> products) {
        // 获取价格大于5000且评分高于4.8分的商品信息
        products.stream()
                .filter(product -> product.getPrice() > 5000 && product.getRating() > 4.8)
                .forEach(product -> System.out.println(product));
    }

    private static void test3(List<Product> products) {
        // 获取销量最高的前3个商品
        products.stream().sorted((a, b) -> Double.compare(b.getSales(), a.getSales()))
                .limit(3)
                .forEach(product -> System.out.println(product));
    }

    private static void test2(List<Product> products) {
        // 获取评分最高的前3个商品并打印
        products.stream().sorted((a, b) -> Double.compare(b.getRating(), a.getRating()))
                .limit(3)
                .forEach(product -> System.out.println(product));
    }

    private static void test01(List<Product> products) {
        // 打印所有商品详情
        products.stream().forEach(product -> System.out.println(product));
    }
}