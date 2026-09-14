package com.wcy.oop.HomeWork3;

public class BookTest {
    public static void main(String[] args) {
        BookManager manager = new BookManager(3);

        // 加书
        manager.addBook(new Book(1, "三体", "刘慈欣", 45.5));
        manager.addBook(new Book(2, "流浪地球", "汪宸宇", 79.5));
        manager.addBook(new ComicBook(3, "海贼王", "尾田荣一郎", 25.0, true));
        manager.addBook(new ComicBook(4, "灌篮高手", "井上雄彦", 30.0, false));
        manager.showAllBooks();

    }
}
