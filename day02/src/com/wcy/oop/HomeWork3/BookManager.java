package com.wcy.oop.HomeWork3;

public class BookManager {
    private Book[] bookList;
    // 存储几本书
    private int count = 0;

    public BookManager(int capacity) {
        // 初始化数组长度
        this.bookList = new Book[capacity];
    }

    // 添加图书的方法
    public void addBook(Book book) {
        // 判断计数器有没有大于数组容量
        if (this.bookList.length <= this.count) {
            // 书柜满了
            System.out.println("书柜满了");
            return;
        }
        // 数组长度没有越界则可以执行新增操作
        this.bookList[this.count] = book;
        // 计数器自增
        this.count++;
    }

    // 打印全部图书信息
    public void showAllBooks() {
        if (this.count == 0) {
            System.out.println("暂无图书");
            return;
        }
        for (Book book : this.bookList) {
            book.showBookInfo();
        }
    }
}
