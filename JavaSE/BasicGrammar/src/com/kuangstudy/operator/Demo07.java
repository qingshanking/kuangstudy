package com.kuangstudy.operator;

/**
 * 三元运算符
 *
 * @author yanqs
 * @date 2021-11-14
 */
public class Demo07 {
    public static void main(String[] args) {
        //x ? y :z
        //如果x==true 则结果为y 否则结果为z

        int score = 80;
        String result = score < 60 ? "不及格" : "及格";
        System.out.println(result);
    }
}
