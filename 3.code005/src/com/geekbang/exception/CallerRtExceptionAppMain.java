package com.geekbang.exception;

import com.geekbang.exception.myexceptions.MyRuntimeException;

public class CallerRtExceptionAppMain {
    public static void main(String[] args) {
        // >> TODO RuntimeException,也就是unchecked exception不强制处理，所以冷不丁吃到一个RuntimeException，程序会失败
        Caller1 caller1 = new Caller1();
        System.out.println("调用开始");
        try {
            caller1.call2RTException();
        }catch (MyRuntimeException ex){
            // >> TODO 错误的演示！不应该使用异常做正常处理逻辑下的跳转
            System.out.println("凌波微步到了");
        }
        System.out.println("调用结束");
    }
}
