package com.wcy.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo04 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java编程", 59.0, 80));
        books.add(new Book("Python入门", 45.0, 120));
        books.add(new Book("MySQL实战", 68.0, 35));
        books.add(new Book("Spring框架", 89.0, 60));
        books.add(new Book("Redis详解", 75.0, 45));
        books.add(new Book("Linux教程", 55.0, 90));
        books.add(new Book("算法导论", 98.0, 25));
        books.add(new Book("数据结构", 52.0, 70));


        // 任务 1：筛选畅销图书 筛选出销量大于等于 50 本的图书，按销量降序排序，遍历输出这些图书的书名和销量
        // books.stream().filter(book -> book.getSales() >= 50)
        //         .sorted((book1, book2) -> Double.compare(book2.getSales(), book1.getSales()))
        //         .forEach(book -> System.out.println("书名是: " + book.getName() + "销量是: " + book.getSales()));


        // 任务 2：查找价格合适的图书 筛选出价格在 30-80 元之间（包含边界）的图书，将书名提取出来，收集到一个新的 List 集合中，遍历输出这个集合
        // List<String> collect = books.stream().filter(book -> book.getPrice() >= 30 && book.getPrice() <= 80)
        //         .map(book -> book.getName())
        //         .collect(
        //                 Collectors.toList()
        //         );
        // collect.forEach(bookname -> System.out.println(bookname));


        // 任务 3：统计高价图书数量 筛选出价格大于 60 元的图书，统计这类图书的数量并输出
        // long count = books.stream().filter(book -> book.getPrice() >= 60).count();
        // System.out.println("大于 60 元的图书:" + count);


        // 任务 4：获取销售额最高的图书 找出销售额（价格 × 销量）最高的图书，输出这本书的完整信息（书名、价格、销量）
        // Book book = books.stream().max((a, b) -> Double.compare(a.getPrice() * a.getSales(), b.getPrice() * b.getSales()))
        //         .orElse(null);
        // System.out.println(book);

        // 任务 5：合并两个图书列表并去重 创建第二个包含 3-4 本图书的 List 集合（可以与第一个列表有重复），将两个列表合并 去除重复的图书（书名相同的视为重复），按价格升序排序后遍历输出
        List<Book> books2 = new ArrayList<>();
        books2.add(new Book("Java编程", 59.0, 80));      // 与 books 重复（书名相同）
        books2.add(new Book("C++ Primer", 88.0, 40));    // 新书
        books2.add(new Book("算法导论", 98.0, 25));      // 与 books 重复（书名相同）
        books2.add(new Book("Vue实战", 65.0, 55));       // 新书

        // 合并流
        Stream.concat(books2.stream(), books.stream()).distinct()
                .sorted((b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()))
                .forEach(book -> System.out.println(book));

    }
}

class Book {
    private String name;    // 书名
    private double price;   // 价格
    private int sales;      // 销量

    public Book() {
    }

    public Book(String name, double price, int sales) {
        this.name = name;
        this.price = price;
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                '}';
    }
}