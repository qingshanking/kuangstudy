package com.kuangstudy.scanner;

import java.util.Scanner;

/**
 * Scanner 案列
 * <p>
 * 输入多个数字，并求其总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并执行执行结果
 *
 * @author yanqs
 * @date 2021-11-15
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //和
        double sum = 0;
        //个数
        int m = 0;
        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            m++;
            sum = sum + x;
            System.out.println("您输入了第" + m + "个数据，然后当前结果sum=" + sum);
        }
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均数" + (sum / m));
    }
}
