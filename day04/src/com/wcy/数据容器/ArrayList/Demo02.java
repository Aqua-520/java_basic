package com.wcy.数据容器.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo02 {
    public static void main(String[] args) {
        // 创建单列集合
        List<String> cart = new ArrayList<>();

        // 添加六件商品
        cart.add("Java入门");
        cart.add("宁夏枸杞");
        cart.add("黑枸杞");
        cart.add("人字拖");
        cart.add("特级枸杞");
        cart.add("枸杞子");

        // 移除包含枸杞关键字的商品
        // cart.removeIf(goods -> goods.contains("枸杞"));

        // 迭代器删除
        Iterator<String> cartIterator = cart.iterator();

        while (cartIterator.hasNext()) {
            if (cartIterator.next().contains("枸杞")) {
                cartIterator.remove();
            }
        }

        System.out.println(cart);
    }


}
