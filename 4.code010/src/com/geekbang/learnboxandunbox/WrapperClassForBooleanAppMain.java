package com.geekbang.learnboxandunbox;

public class WrapperClassForBooleanAppMain {
    public static void main(String[] args) {
        // TODO boolean对应的类为Boolean，布尔值因为只有两个值，所以Boolean类直接提供了这两个值的静态变量
        System.out.print("------------------静态变量--------------------");

        System.out.print(Boolean.TRUE);
        System.out.print(Boolean.FALSE);

        System.out.print("------------------valueOf--------------------");
        // TODO 只有不分大小写的true才是true，剩下的字符串都是false
        System.out.print(Boolean.valueOf("true"));
        System.out.print(Boolean.valueOf("false"));
        System.out.print(Boolean.valueOf("asdf"));
        System.out.print(Boolean.valueOf(" true "));
    }
}
