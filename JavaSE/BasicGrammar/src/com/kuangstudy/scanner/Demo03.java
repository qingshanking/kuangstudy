package com.kuangstudy.scanner;

import java.util.Scanner;

/**
 * Scanner 类的使用
 * 进阶使用
 *
 * @author yanqs
 * @date 2021-11-15
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数:");
        if (scanner.hasNextInt()) {
            int s = scanner.nextInt();
            System.out.println("输出整数：" + s);
        } else {
            System.out.println("您输入的不是整数数据");
        }
        System.out.println("请输入小数");
        if (scanner.hasNextFloat()) {
            float f = scanner.nextFloat();
            System.out.println("输出小数：" + f);
        } else {
            System.out.println("您输入的不是小数");
        }
        scanner.close();
    }
}
