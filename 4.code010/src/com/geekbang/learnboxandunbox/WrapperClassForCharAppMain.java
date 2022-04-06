package com.geekbang.learnboxandunbox;

public class WrapperClassForCharAppMain {
    public static void main(String[] args) {
        // TODO char对应的类为Character，里面有很多isXXX方法比较实用，比如判断字符是否为数字
        System.out.print(Character.isDigit('A'));
        System.out.print(Character.isDigit('字'));
        System.out.print(Character.isDigit('0'));
        System.out.print(Character.isDigit('9'));
    }
}
