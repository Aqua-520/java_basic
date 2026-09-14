package com.wcy.oop.多态_a;

class MyServiceStation {
    // 定义加油站消费方法
    public void fueling(VipCard card, double price) {
        // 传入卡对象
        card.pay(price);
    }

    public void reCharge(VipCard card, double price) {
        card.charge(price);
    }
}

// 定义会员卡父类
abstract class VipCard {
    private String name;
    private double balance;

    public VipCard(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 定义消费抽象方法,每种会员等级的折扣不一样
    public abstract void pay(double money);

    // 实际方法,充值
    public void charge(double price) {
        this.balance += price;
    }
}

// 定义金卡
class GoldCard extends VipCard {
    // 构造函数初始化属性
    public GoldCard(double balance, String name) {
        super(balance, name);
    }

    // 重写折扣方法
    public void pay(double money) {
        // 计算实际需要扣款的价格
        double payResult = money * 0.8;

        // 判断余额是否充足
        if (this.getBalance() < payResult) {
            throw new RuntimeException("金卡余额不足,请充值");
        }

        // 扣款
        this.setBalance(this.getBalance() - payResult);
        System.out.println("消费成功,支付价格" + payResult + "余额" + this.getBalance());
    }
}

// 定义银卡
class SilverCard extends VipCard {
    // 构造函数初始化属性
    public SilverCard(double balance, String name) {
        super(balance, name);
    }

    // 重写折扣方法
    public void pay(double money) {
        // 计算实际需要扣款的价格
        double payResult = money * 0.85;

        // 判断余额是否充足
        if (this.getBalance() < payResult) {
            throw new RuntimeException("金卡余额不足,请充值");
        }

        // 扣款
        this.setBalance(this.getBalance() - payResult);

        System.out.println("消费成功,支付价格" + payResult + "余额" + this.getBalance());
    }
}

// 主函数
public class ServiceStation {
    public static void main(String[] args) {
        // 实例化加油站
        MyServiceStation station = new MyServiceStation();

        VipCard card1 = new GoldCard(10000, "汪宸宇");
        VipCard card2 = new SilverCard(5000, "黄一个");
        station.fueling(card1, 3000);
        station.fueling(card1, 1000);
        station.fueling(card1, 674);

        station.fueling(card2, 3000);
        station.fueling(card2, 1000);
        station.fueling(card2, 674);
    }
}

