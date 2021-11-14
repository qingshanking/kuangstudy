package com.kuangstudy.base;

/**
 * 拓展演示
 *
 * @author yanqs
 * @date 2021-11-13
 */
public class Demo03 {
    public static void main(String[] args) {
        /**
         * 整数拓展
         * 进制:二进制0b、十进制、八进制0、十六进制0x
         */
        int i = 10;
        // 八进制
        int i2 = 010;
        //十六进制0x 0~9 A~F 16
        int i3 = 0x10;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("===========================");


        /**
         * 浮点数拓展：银行业务 钱
         * BigDecimal
         * float   有限 离散 舍入误差  大约  接近但不等于
         * double
         * 最好完全使用浮点数进行比较
         * 最好完全使用浮点数进行比较
         * 最好完全使用浮点数进行比较
         */
        float f = 0.1f;
        //0.1
        double d = 1.0 / 10;
        //0.1
        System.out.println(f == d);
        //false
        System.out.println(f);
        //0.1
        System.out.println(d);
        //0.1


        System.out.println("===========================");

        /**
         * 字符扩展
         *
         * 所有的字符本质还是数字
         * 编码 Unicode 表：(97 = a 65 = A) 2字节 65536字符  Excel 最多只有2的十六方 65536
         *
         * U0000 UFFFF
         */

        char c1 = 'A';
        char c2 = '中';
        System.out.println(c1);
        //强制转换
        System.out.println((int) c1);
        System.out.println(c2);
        //强制转换
        System.out.println((int) c2);

        char c3 = '\u0061';
        //a
        System.out.println(c3);
        System.out.println("===========================");


        /**
         * 转义字符
         * \t 制表符
         * \n 换行
         * ...
         */

        System.out.println("Hello\tWord");
        System.out.println("Hello\nWord");


        System.out.println("===========================");
        /**
         * 内存 堆和栈
         */
        String s1 = new String("S");
        String s2 = new String("S");
        System.out.println(s1 == s2);
        String s3 = "S";
        String s4 = "S";
        System.out.println(s3 == s4);


        /**
         * 布尔值拓展
         */
        boolean flag = true;
        //新手
        if (flag == true) {
        }
        //老手
        if (flag) {
        }
        //Less is More! 代码要精简易读！
    }
}
