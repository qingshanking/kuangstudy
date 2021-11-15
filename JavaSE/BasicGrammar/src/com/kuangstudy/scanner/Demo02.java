package com.kuangstudy.scanner;

import java.util.Scanner;

/**
 * Scanner 类的使用
 * nextLine()方法使用
 *
 * @author yanqs
 * @date 2021-11-15
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            System.out.printf("输出内容：" + str);
        }
        scanner.close();
    }
}
