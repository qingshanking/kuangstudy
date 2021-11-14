package com.kuangstudy.operator;

/**
 * 位运算
 * 跟二进制有关
 *
 * @author yanqs
 * @date 2021-11-14
 */
public class Demo05 {
    public static void main(String[] args) {
        /**
         * A = 0011 1100
         * B = 0000 1101
         * -------------------
         * A&B = 0000 1100 (A与B)
         * A|B = 0011 1101 (A或B)
         * A^B = 0011 0001 (取反)
         * ~B  = 1111 0010 (取反)
         *
         * << 左移  *2
         * >> 右移  /2
         */
        //2*2*2
        System.out.println(2<<2);
        //2*2*2*2 16
        System.out.println(2<<3);
    }
}
