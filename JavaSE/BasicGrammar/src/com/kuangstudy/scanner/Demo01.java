package com.kuangstudy.scanner;

import java.util.Scanner;

/**
 * Scanner 类的使用
 * next()方法使用
 *
 * @author yanqs
 * @date 2021-11-15
 */
public class Demo01 {
    public static void main(String[] args) {
        /**
         * Next()
         */
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        //判断用户有没有输入字符串
        if (scanner.hasNext()) {
            //使用next方式接收
            String str = scanner.next();
            System.out.printf("输出内容：" + str);
        }
        //凡是属于IO流的类不关闭会一直占用资源，要用完就关掉的好习惯
        scanner.close();
    }
}
