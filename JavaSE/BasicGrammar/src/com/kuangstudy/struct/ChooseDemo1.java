package com.kuangstudy.struct;

import java.util.Scanner;

/**
 * @author yanqs
 * @date 2022-01-08
 */
public class ChooseDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score == 100) {
            System.out.println("满分");
        } else if (score < 100 && score >= 60) {
            System.out.println("达标");
        } else if (score < 60) {
            System.out.println("未达标");
        } else {
            System.out.println("成绩不合法");
        }
        scanner.close();
    }
}
