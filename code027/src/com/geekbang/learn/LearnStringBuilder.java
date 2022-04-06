package com.geekbang.learn;

public class LearnStringBuilder {
    public static void main(String[] args) {

        // TODO StringBuilder首先是可变的
        // TODO 而且对它进行操作的方法，都会返回this自引用。这样我们就可以一直点下去，对String进行构造.
        StringBuffer stringBuffer = new StringBuffer();

        long longVal = 123456789;

        stringBuffer.append(true).append("abc").append(longVal);

        System.out.println(stringBuffer.toString());
        System.out.println(stringBuffer.reverse().toString());
        System.out.println(stringBuffer.reverse().toString());
        System.out.println(stringBuffer.toString());

        System.out.println(stringBuffer.delete(0,4).toString());

        System.out.println(stringBuffer.insert(3,"LLLLL").toString());
    }
}
