package com.kuangstudy.struct;

/**
 * 增强For循环
 *
 * @author yanqs
 * @date 2022-03-24
 */
public class ForDemo05 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1, 5, 7, 10, 14, 19, 20};
        for (int x : arr) {
            System.out.println(x);
        }
        System.out.println("+++++++++++++++++++++++++");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
