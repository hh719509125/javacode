package com.geekbang.exception;

public class Caller2 {
    Caller3 caller3 = new Caller3();

    public void call3RTException(){
        System.out.println("Caller2.call3RTException开始");
        caller3.callThrowRTException();
        System.out.println("Caller2.Caller2call3RTException开始");
    }

    public void call3Exception() throws ClassNotFoundException{
        System.out.println("Caller2.call3RTException开始");

        caller3.callThrowRTException();
        System.out.println("Caller2.call3RTException结束");
    }
}
