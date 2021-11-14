package com.kuangstudy.operator;

/**
 * 逻辑运算符
 *
 * @author yanqs
 * @date 2021-11-14
 */
public class Demo06 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // a=a+b
        a += b;
        // a=a-b;
        a -= b;
        System.out.println(a);
        System.out.println(a + b);
        //字符串连接符 + ，String
        System.out.println("" + a + b);
        //1020
        System.out.println(a + b + "");
        //30
    }
}
