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

    /**
     * ASCII 与字符的相互转换
     */
    @Test
    public void test5() {
        char c = '爱';
        System.out.println("c=" + c);
        //将字符 ==》 ASCII码（十进制的数字）
        int i = (int) c;
        System.out.println(" i=" + i);
        //将一个十进制的数字 ==》 字符
        char c2 = (char) i;
        System.out.println("c2=" + c2);
    }

    /**
     * 　String类：
     * 　String是 java中已经设计好的一个类，表示的值是字符串（Java中设计的类和我们自己设计的类的性质是一样的）
     */
    @Test
    public void test6() {
        String str = "爱老虎油！";
        System.out.println("str=" + str);
    }

    /**
     * 类型转换：自动转换
     */
    @Test
    public void test7() {
        byte b = 65;
        //byte自动转变为 short
        short bs = b;
        //short 自动转变为 int
        int bsi = bs;
        //int 自动转变 long
        long bsil = bsi;
        //long 自动转变为 float
        float bsilf = bsil;
        //float 自动转变为 double
        double bsilfd = bsilf;
        System.out.println("bsilfd=" + bsilfd);
        //也可以越级 自动转换，比如：byte 自动 转换为 double
        double bd = b;
        System.out.println("bd=" + bd);
    }

    /**
     * 类型转换：强制转换
     */
    @Test
    public void test8() {
        double d = 3.1415926978568412;
        //double 强制转变为 float
        float df = (float) d;
        //float 强制转变为 long
        long dfl = (long) df;
        //long 强制转变为 int
        int dfli = (int) dfl;
        //int 强制转变为 short
        short dflis = (short) dfli;
        //short 强制转变为 byte
        byte dflisb = (byte) dflis;
        System.out.println("dflisb=" + dflisb);
        //也可以越级 强制转换，比如：double 强制 转换为 byte
        byte db = (byte) d;
        System.out.println("db=" + db);
    }

    /**
     * 运算中自动转型：在类型不一致的运算中最终会 得到一个最大的类型
     */
    @Test
    public void test9() {
        int num = 10;
        double b = 10.01;
        double c = num + b;
        // 这样会报错，因为最后运算完成的类型是double，不能自动转变为int
        // int  c2 = num + b;
        System.out.println(c);
    }

    /**
     * byte  --> short ，char  --> int  -->   long -->    float  -->    double
     * <p>
     * char类型向更高长度类型（例如整型）转换时，会转换为对应的ASCII码值，再做其他类型的自动转换
     * <p>
     * char 不能和byte short 相互自动转换,应为取值范围问题，简单的可以这样理解，char是没有负数的，而其是有负数的
     */
    @Test
    public void test10() {
        char c = 'A'; // 65
        int num = 10;
        int a = c + num;
        System.out.println(a);
        //=======================
        byte b = 65;
        //byte不能自动转变为 char
        // char bc=b;
        //但是，byte是可以强制转变为char的
        char bc = (char) b;
        System.out.println(" bc=" + bc);
        //=======================
        char c2 = 'A';// 65
        // char 不能自动转变为 short
        // short c2s=c2;
        //但是，char是可以强制转变为short的
        short c2s = (short) c2;
        System.out.println(" c2s=" + c2s);
    }

    /**
     * 特例
     * byte  b  =  65;//可以自动转换
     * int  k =65;
     * byte b2 =k;//不能转换，报错
     * 我们是把一个常量直接赋值给byte变量，由于编译器能识别100，知道在byte范围之内，所以通过编译。
     * byte b2 =k; 在编译时候，k是int型，但它是一个变量，编译器不能知道变量中值是多少，所以不能隐式转换，提示你可能精度损失。
     */
    @Test
    public void test11() {
        byte b = 65;//可以自动转换
        int k = 65;
        //byte b2 = k;//不能转换，报错
    }

    /**
     * 特例：了解
     * 将一个负数强制转变为 char,在将这个char转变为整数，会是什么情况？
     */
    @Test
    public void test12() {
        int i = -65;
        char c = (char) i;
        System.out.println("c=" + c);

        int i2 = c;
        System.out.println("i2=" + i2);

        char c2 = (char) i2;
        System.out.println("c2=" + c2);

    }

    /**
     * 特例了解
     * System.out.println((int) (char) (byte) -1);
     * 它以int数值-1开始，然后从int转型为byte，之后转型为char，最后转型回int。
     * 第一个转型将数值从32位窄化到了8位，第二个转型将数值从8位拓宽到了16位，最后一个转型又将数值从16位拓宽回了32位。
     * 这个数值最终是回到了起点吗？如果你运行该程序，你就会发现不是。它打印出来的是65535，但是这是为什么呢？
     * <p>
     * 该程序的行为紧密依赖于转型的符号扩展行为。
     * Java使用了基于2的补码的二进制运算，因此int类型的数值-1的所有32位都是置位的。
     * 从int到byte的转型是很简单的，它执行了一个窄化原始类型转化（narrowing primitive conversion），直接将除低8位之外的所有位全部砍掉。
     * 这样做留下的是一个8位都被置位了的byte，它仍旧表示-1。
     * <p>
     * 从byte到char的转型稍微麻烦一点，因为byte是一个有符号类型，而char是一个无符号类型。
     * 在将一个整数类型转换成另一个宽度更宽的整数类型时，通常是可以保持其数值的，但是却不可能将一个负的byte数值表示成一个char。
     * 因此，从byte到char的转换被认为不是一个拓宽原始类型的转换，而是一个拓宽并窄化原始类型的转换（widening and narrowing primitive conversion）：byte被转换成了int，而这个int又被转换成了char。
     * <p>
     * 所有这些听起来有点复杂，幸运的是，有一条很简单的规则能够描述从较窄的整型转换成较宽的整型时的符号扩展行为：
     * 如果最初的数值类型是有符号的，那么就执行符号扩展；如果它是char，那么不管它将要被转换成什么类型，都执行零扩展。
     * 了解这条规则可以使我们很容易地解决这个谜题。
     * <p>
     * 因为byte是一个有符号的类型，所以在将byte数值-1转换成char时，会发生符号扩展。
     * 作为结果的char数值的16个位就都被置位了，因此它等于2*E16-1，即65535。
     * 从char到int的转型也是一个拓宽原始类型转换，所以这条规则告诉我们，它将执行零扩展而不是符号扩展。
     * 作为结果的int数值也就成了65535，这正是程序打印出的结果。
     */
    @Test
    public void test13() {
        //=======了解==============
        System.out.println((int) (char) (byte) -0);
        System.out.println((int) (char) (byte) -1);
        System.out.println((int) (char) (byte) -2);
        System.out.println((int) (char) (byte) -3);
        System.out.println((int) (char) (byte) -4);
        System.out.println((int) (char) (byte) -5);
        System.out.println((int) (char) (byte) -6);
    }

    /**
     * 数据类型过长 和 溢出
     * <p>
     * 生产上大的数据运算一定要注意
     */
    @Test
    public void test14() {
        byte b = 127;
        // byte b1=128;// 错误超出范围  -128 到 127

        //===============================
        //获取当前时间 毫秒
        long time = System.currentTimeMillis();
        System.out.println("time=" + time);
        int i = (int) time;
        System.out.println("i=" + i);

        //==============================
        int a = 129;
        byte b2 = (byte) a;
        System.out.println("b2=" + b2); // 结果为  -127
    }
}
