package com.wcy.oop.Final关键字;

public class Demo02 {
    public static void main(String[] args) {
        Store store = new Store();
        store.upDateOrder("843708301", Dict.API_KEY);
        store.upDateOrder("1234567", Dict.WCY_SAYHI);
    }
}

class Dict {
    public static final String API_KEY = "sk123123123";
    public static final String WCY_SAYHI = "汪宸宇最帅";
}

class Store {
    public void upDateOrder(String orderId, String orderState) {
        System.out.println(orderId + " 订单状态修改为 " + orderState);
    }
}