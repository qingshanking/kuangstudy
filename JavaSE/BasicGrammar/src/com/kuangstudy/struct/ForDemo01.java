package com.kuangstudy.struct;

/**
 * for循环
 *
 * @author yanqs
 * @date 2022-03-24
 */
public class ForDemo01 {
    public static void main(String[] args) {
        //初始化条件
        int a = 1;
        while (a <= 100) {
            System.out.println(a);
            a += 2;
        }
        System.out.println("while循环结束");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        //死循环代码
        for (; ; ) {

        }
    }
}
