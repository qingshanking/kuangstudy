package com.kuangstudy.base;

/**
 * 类型转换
 *
 * @author yanqs
 * @date 2021-11-14
 */
public class Demo04 {

    public static void main(String[] args) {
        /**
         * 强制转换 （类型）变量名    高--低
         */
        int i = 128;
        byte b = (byte) i;
        //内存溢出

        System.out.println(i);
        System.out.println(b);

        /**
         * 自动转换  低--高
         */

        int i1 = 128;
        double d = i1;
        System.out.println(i1);
        System.out.println(d);

        /**
         * 注意：
         * 1.不能对布尔值进行转换
         * 2.不能把对象类型转换为不相干的类型
         * 3.在把高容量转换到低容量的时候，强制转换
         * 4.转换的时候可能存在内存移除，或者精度问题！
         */

        System.out.println((int) 23.7);
        //23
        System.out.println((int) -23.79f);
        //-23


        // 类型转换
        char c1 = 'a';
        int d1 = c1 + 1;
        System.out.println(c1);
        System.out.println(d1);
        System.out.println((char) d1);


        System.out.println("==============================================");

        //操作比较大的数的时候，注意溢出问题
        //JDK7新特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
        int years = 20;
        int total = money * years;
        //-1474836480 计算的时候溢出了
        long total2 = money * years;
        //默认是int,转换之前已经出问题了
        long total3 = money * (long) years;
        //先把一个数转化为long
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);

    }


}
