package com.kuangstudy.struct;

import java.util.Scanner;

/**
 * 选择结构
 *
 * @author yanqs
 * @date 2022-01-08
 */
public class ChooseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String str = scanner.nextLine();
        if (str.equals("hello")) {
            System.out.println(str);
        } else {
            System.out.println("未满足");
        }
        scanner.close();
    }
}
