package com.kuangstudy.struct;

/**
 * 练习二
 * 用while和for循环输出1-1000之间被5整除的数 并且每行输出3个
 *
 * @author yanqs
 * @date 2022-03-24
 */
public class ForDemo03 {
    public static void main(String[] args) {
        System.out.println("for");
        int count = 1000;
        for (int i = 0; i <= count; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
            }
            if (i % (5 * 3) == 0) {
                System.out.println("\n");
            }
        }

        System.out.println("while");
        int i = 0;
        while (i <= count) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
            }
            if (i % (5 * 3) == 0) {
                System.out.println("\n");
            }
            i++;
        }


    }
}
