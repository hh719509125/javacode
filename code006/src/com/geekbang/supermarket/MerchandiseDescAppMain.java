package com.geekbang.supermarket;

public class MerchandiseDescAppMain {
    public static void main(String[] args) {
        Merchandise merchandise = new Merchandise();

        merchandise.name = "书桌";
        merchandise.soldPrice = 999.9;
        merchandise.purchasePrice = 500;
        merchandise.count = 40;
        merchandise.id = "DESK9527";

        System.out.println("商品的名字叫做" + merchandise.name + "，id是" + merchandise.id + "。商品的售价是" + merchandise.soldPrice
                + "。商品的进价是" + merchandise.purchasePrice + "。商品的库存数量是" + merchandise.count +
                "。销售一个的毛利润是" + (merchandise.soldPrice - merchandise.purchasePrice));
    }
}
