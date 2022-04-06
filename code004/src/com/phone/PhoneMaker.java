package com.phone;

import com.phone.Phone;

public class PhoneMaker {
    public static void main(String[] args) {
        //创建一个Phone的实例
        Phone phone = new Phone();
        //可以设置断点查看实例内部状态
        phone.hasFigurePrintUnlocker = true;
    }
}
