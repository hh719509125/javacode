package com.geekbang.supermarket;

public class MerchandiseV2 {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;
    String madeIn;

    // >> TODO 访问修饰符
    // >> TODO 返回值类型：无需返回值则用void表示，void是java中的关键字
    // >> TODO 方法名：人以合法的标识符都可以
    // >> TODO 参数列表：后续讲解
    // >> TODO 方法体：方法的代码
    // >> TODO 方法体内部定义的变量叫做局部变量
    public void describe(){
        double netIncome = soldPrice - purchasePrice;
        System.out.println("商品的名字叫做" + name + "，id是" + id + "。商品的售价是" + soldPrice
        + "。商品的进价是" + purchasePrice + "。商品的库存是" + count +
                "。销售一个的毛利润是" + netIncome + "制造地是" + madeIn);
    }
}





