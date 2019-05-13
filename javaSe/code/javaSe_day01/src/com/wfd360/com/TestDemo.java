package com.wfd360.com;

/**
 * 一个Java源文件中可以写多个并列的类，编译完毕之后会生成多个独立的字节码文件
 * 如果一个类使用public修饰，必须和源文件名字一致
 */
public class TestDemo {
    public void method() {
        System.out.println("---no main method-----");
    }
}

class TestDemo2 {
    public void method() {
        System.out.println("---no main method-----");
    }
}
