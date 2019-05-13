package com.wfd360.com;

import org.junit.Test;

/**
 * <p>
 * 1.数据类型概述
 * 123,3.14
 * 在java中不同类型的数据有不同的数据类型，看看下面的数据类型的分类：
 * 分类：
 * 一、基本数据类型 8 种 java预定义的类型(原生数据类型)
 * 1.整数类型 *4 123
 * byte 1个字节8位
 * short 2字节16位
 * int 4字节32位
 * long 8字节64位
 * <p>
 * 2.小数类型(浮点类型) *2 3.14
 * float 单精度 4字节32位
 * double 双精度 8字节64位
 * 3.字符类型 *1
 * char 2字节16位 ‘A’,’B’
 * 4.布尔类型*1
 * boolean 俩值 true ,false
 */
public class DataType {
    /**
     * 整数类型 4种
     */
    @Test
    public void test1() {
        //byte 1个字节8位
        byte b = 6;
        //short 2字节16位
        short s = 6;
        //int 4字节32位 (经常使用)
        int i = 6;
        //long 8字节64位 （通常在取时间毫秒时使用）
        long l = 6;
        String format = String.format("b=%s,s=%s,i=%s,l=%s", b, s, i, l);
        System.out.println(" format=" + format);
    }

    /**
     * 小数类型 2种
     */
    @Test
    public void test2() {
        // float 单精度 4字节32位,后面必须带f,大写也可以，建议使用小写
        float f = 3.14f; //推荐写法
        float f2 = 3.14F;
        // double 双精度 8字节64位  (经常使用)
        double d = 3.14; //推荐写法
        double d2 = 3.14d;
        double d3 = 3.14D;
        String format = String.format("f=%s,f2=%s,d=%s,d2=%s,d3=%s", f, f2, d, d2, d3);
        System.out.println(" format=" + format);
    }

    /**
     * 字符类型 1种
     */
    @Test
    public void test3() {
        //char 2字节16位 ,例如：‘A’,’B’，注意使用的是单引号，一般不使用，一般使用String类型代替
        char c = 'A';
        System.out.println("c=" + c);
    }

    /**
     * 布尔类型 1 种
     */
    @Test
    public void test4() {
        // boolean 俩值 true ,false
        boolean b = true;
        boolean b2 = false;
        System.out.println("b=" + b + ",b1=" + b2);
    }

    @Test
    public void test5() {
        char c = '爱';
        System.out.println("c=" + c);

        int i = (int) c;
        System.out.println(" i=" + i);

        char c2 = (char) i;
        System.out.println("c2=" + c2);

        String str="爱老虎油";
        char c1 = str.charAt(0);
        int i1 = (int) c1;
        System.out.println("i1="+i1);
    }
}
