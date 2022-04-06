package com.geekbang.learnfile;

import java.io.File;

public class SeparatorAppMain {
    public static void main(String[] args) {
        System.out.print("文件路径分隔符：" + File.separator);
        System.out.print("环境变量分隔符：" + File.pathSeparator);
    }
}
