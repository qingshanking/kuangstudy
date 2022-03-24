package com.kuangstudy.struct;

/**
 * For作业
 * 练习一
 * 计算0到100之间的奇数和偶数的和
 *
 * @author yanqs
 * @date 2022-03-24
 */
public class ForDemo02 {

    public static void main(String[] args) {
        //奇数和
        int oldSum = 0;
        //偶数和
        int evenSum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                //奇数
                oldSum += i;
            } else {
                //偶数
                evenSum += i;
            }
        }
        System.out.println("奇数和：" + oldSum);
        System.out.println("偶数和：" + evenSum);


    }
}
