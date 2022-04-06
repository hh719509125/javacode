package com.geekbang.exception.myexceptions;

public class MyRuntimeException extends RuntimeException{
    public MyRuntimeException(){

    }

    public MyRuntimeException(String message){
        super(message);
    }

    public MyRuntimeException(String mesage, Throwable cause){
        super(mesage,cause);
    }

    public MyRuntimeException(Throwable cause){
        super(cause);
    }
}
