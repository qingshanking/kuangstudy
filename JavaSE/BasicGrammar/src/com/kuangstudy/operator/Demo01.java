package com.kuangstudy.operator;

/**
 * 基本运算符
 *
 * @author yanqs
 * @date 2021-11-14
 */
public class Demo01 {

    public static void main(String[] args) {
        /**
         * 算数运算符
         */

        //二元运算符
        // Ctrl+D ：复制当前行到下一行
        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / (double) b);

        // 拓展
        long a1 = 12231531153L;
        int a2 = 55536636;
        short a3 = 10;
        byte a4 = 8;
        //Long
        System.out.println(a1 + a2 + a3 + a4);
        //Int
        System.out.println(a2 + a3 + a4);
        //Int
        System.out.println(a3 + a4);
    }
}
