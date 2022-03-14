package com.kuangstudy.loop;

/**
 * 思考
 * 计算1+2+3+...+100
 *
 * @author yanqs
 * @date 2022-03-14
 */
public class WhileWork {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
