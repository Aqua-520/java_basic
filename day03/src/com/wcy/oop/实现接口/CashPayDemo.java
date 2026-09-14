package com.wcy.oop.实现接口;

public class CashPayDemo {
    public static void main(String[] args) {
        PayService payService = new PayService();

        payService.onlinePay(new Alipay());
        payService.offlinePay(new CashPay());
    }
}


// 在线支付接口
interface OnlinePay {
    void onlinePay();
}

// 离线支付接口
interface OfflinePay {
    void offlinePay();
}

// 定义三个支付类,实现接口
class Alipay implements OnlinePay, OfflinePay {
    // 实现支付

    @Override
    public void onlinePay() {
        System.out.println("支付宝在线支付");
    }

    @Override
    public void offlinePay() {
        System.out.println("支付宝实现离线支付");
    }
}

class WechatPay implements OnlinePay, OfflinePay {
    // 实现支付

    @Override
    public void onlinePay() {
        System.out.println("微信在线支付");
    }

    @Override
    public void offlinePay() {
        System.out.println("微信实现离线支付");
    }
}

class CashPay implements OfflinePay {
    // 重写离线支付

    @Override
    public void offlinePay() {
        System.out.println("现金离线支付");
    }
}

// 支付系统
class PayService {
    public void onlinePay(OnlinePay pay) {
        pay.onlinePay();
    }

    public void offlinePay(OfflinePay pay) {
        pay.offlinePay();
    }
}