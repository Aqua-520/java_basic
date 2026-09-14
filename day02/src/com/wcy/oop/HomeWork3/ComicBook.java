package com.wcy.oop.HomeWork3;

public class ComicBook extends Book {
    boolean isSerial;

    public ComicBook(int bookId, String bookName, String author, double price, boolean isSerial) {
        super(bookId, bookName, author, price);
        this.isSerial = isSerial;
    }

    public boolean isSerial() {
        return isSerial;
    }

    public void setSerial(boolean serial) {
        isSerial = serial;
    }

    @Override
    public void showBookInfo() {
        super.showBookInfo();  // 先打印父类信息
        System.out.printf("连载状态: %s%n", isSerial ? "连载中" : "已完结");
    }
}
