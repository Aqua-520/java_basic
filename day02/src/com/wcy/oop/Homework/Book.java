package com.wcy.oop.Homework;

public class Book {
    public static void main(String[] args) {
        MyBook book01 = new MyBook();
        book01.setBookName("亲热天堂");
        book01.setPrice(19.99);
        System.out.println(book01);

        // 使用构造函数初始化
        System.out.println(new MyBook("流浪地球", 29.90));
    }
}

class MyBook {
    // 私有属性
    private String bookName;
    private double price;

    public MyBook(String bookName, double price) {
        this.bookName = bookName;
        this.price = price;
    }

    public MyBook() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MyBook{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }
}
