package com.kuangstudy.struct;

/**
 * switch选择结构
 *
 * @author yanqs
 * @date 2022-03-14
 */
public class SwitchDemo1 {
    public static void main(String[] args) {
        char grade='C';
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("再接再厉");
                break;
            default:
                System.out.println("未知等级");
                break;
        }
    }
}
