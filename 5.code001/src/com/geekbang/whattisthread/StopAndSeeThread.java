package com.geekbang.whattisthread;

public class StopAndSeeThread {
    public static void main(String[] args) {
        m1();
    }

    public static void m1(){
        m2();
    }

    public static void m2(){
        int a = 999;
        m3();
    }

    public static void m3(){
        int a = 333;
        m4();
    }

    public static void m4(){
        m5();
    }

    public static void m5(){
        int a = 555;
        m6();
    }

    public static void m6(){
        System.out.println("断点停住");
    }
}
