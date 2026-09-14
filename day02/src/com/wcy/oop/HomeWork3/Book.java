package com.wcy.oop.HomeWork3;

public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private double price;

    // 提供全参构造函数

    public Book(int bookId, String bookName, String author, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    // 提供get/set

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showBookInfo() {
        System.out.printf("编号: %-5d 书名: %-15s 作者: %-10s 价格: %.2f元%n",
                bookId, bookName, author, price);
    }
}
