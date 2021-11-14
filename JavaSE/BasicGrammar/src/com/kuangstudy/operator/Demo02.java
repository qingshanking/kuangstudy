package com.kuangstudy.operator;

/**
 * 关系运算符
 * 返回结果：正确、错误  布尔值
 *
 * @author yanqs
 * @date 2021-11-14
 */
public class Demo02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 21;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);


        // 去余，摸运算  21/10=2 余1
        System.out.println(c % a);
    }
}
