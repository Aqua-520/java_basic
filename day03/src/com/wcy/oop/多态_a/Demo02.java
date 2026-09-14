package com.wcy.oop.多态_a;


abstract class Payment {
    // 我是支付类
    public abstract void pay(double money);

}

// 创建支付宝对象
class Alipay extends Payment {
    @Override
    public void pay(double money) {
//        super.pay(money);

        System.out.println("支付宝支付成功,扣款金额:" + money + "元");
    }
}

class WechatPay extends Payment {
    @Override
    public void pay(double money) {
//        super.pay(money);

        System.out.println("微信支付支付成功,扣款金额:" + money + "元");
    }
}

// 新增visa
class Visa extends Payment {
    @Override
    public void pay(double money) {
//        super.pay(money);

        System.out.println("visa支付成功,扣款金额:" + money + "元");
    }
}


// 商城对象
class JD {
    // 订单支付
    public void orderPay(Payment pay, double price) {
        System.out.println("校验商品库存");
        System.out.println("扣除商品库存");

        // 支付
        pay.pay(price);

        System.out.println("商品购买成功");
    }
}

public class Demo02 {
    public static void main(String[] args) {
        JD jd = new JD();

        jd.orderPay(new Alipay(), 12999);
        System.out.println("-------------------");
        jd.orderPay(new WechatPay(), 1999);
        System.out.println("-------------------");
        jd.orderPay(new Visa(), 388888.88);
    }
}
