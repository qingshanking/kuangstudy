package com.kuangstudy.operator;

/**
 * 一元元运算符
 * ++ -- 自增，自减
 *
 * @author yanqs
 * @date 2021-11-14
 */
public class Demo03 {
    public static void main(String[] args) {

        int a = 3;

        //a++ a=a+1
        // 执行完这行代码后，先给b赋值，再自增
        int b = a++;

        System.out.println(a);

        //++a a=a+1
        // 执行玩这行代码钱，先自增，再给b赋值
        int c = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        //幂运算 2^3 2*2*2 =8 很多数据运算，我们会使用一些工具类来操作
        //Math 提供数学中科学运算符
        double pow = Math.pow(2, 3);
        System.out.println(pow);
    }
}
