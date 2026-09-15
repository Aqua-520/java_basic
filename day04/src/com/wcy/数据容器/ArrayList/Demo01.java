package com.wcy.数据容器.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        // 创建单列集合
        List<Movie> mvList = new ArrayList<>();

        mvList.add(new Movie("欢迎来龙餐馆", 8.6, "沈腾"));
        mvList.add(new Movie("给阿嬷的情书", 9.2, "素人演员"));
        mvList.add(new Movie("八仙！", 8.2, "配音演员"));
        mvList.add(new Movie("南京照相馆", 8.8, "刘昊然"));


        // 使用索引进行for i 循环
        // for (int i = 0; i < mvList.size(); i++) {
        //     // 在单列集合中,得通过方法进行数据的读取,不能通过[]的形式,那个是数组
        //     Movie current = mvList.get(i);
        //     // 打印电影信息
        //     System.out.println(current);
        // }

        // 增强for循环
        // for (Movie movie : mvList) {
        //     System.out.println(movie);
        // }

        // 创建迭代器对象
        Iterator<Movie> mvIterator = mvList.iterator();
        // 循环迭代器对象
        while (mvIterator.hasNext()) {
            // 如果有内容,则接收数据,进行打印
            Movie current = mvIterator.next();
            System.out.println(current);
        }

        System.out.println("-------------------------------");

        // lambda表达式,类似箭头函数的形式
        mvList.forEach(current -> System.out.println(current));
    }
}

class Movie {
    private String name;
    private double score;
    private String actor;

    public Movie(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    // 省略setter和getter方法了....
    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", actor='" + actor + '\'' +
                '}';
    }
}

