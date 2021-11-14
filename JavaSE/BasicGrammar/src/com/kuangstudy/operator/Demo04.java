package com.kuangstudy.operator;

/**
 * 逻辑运算符
 *
 * @author yanqs
 * @date 2021-11-14
 */
public class Demo04 {
    public static void main(String[] args) {
        /**
         * 逻辑运算符:与  或  非
         */

        boolean a = true;
        boolean b = false;

        // 逻辑与 运算： 两个变量都为真 结果为true
        System.out.println("a && b:" + (a && b));
        // 逻辑或 运算： 两个变量有一个为真 结果为true
        System.out.println("a || b:" + (a || b));
        // 如果是真，则变为假 如果是假则为真
        System.out.println("!(a && b):" + !(a && b));


        //短路运算
        int c = 5;
        boolean d = (c < 4 && (c++ < 4));
        System.out.println(d);
        System.out.println(c);

    }
}
