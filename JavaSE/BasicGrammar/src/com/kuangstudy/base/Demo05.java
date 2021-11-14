package com.kuangstudy.base;

/**
 * 变量、作用域
 *
 * @author yanqs
 * @date 2021-11-14
 */
public class Demo05 {

    /**
     * 类变量 static
     */
    static double salary = 2500;


    /**
     * 属性：简单理解为变量
     */


    /**
     * 实列变量：从属于对象；如果不进行初始化，会输出为初始化
     * 0 0.0
     * 布尔值： 默认是false
     * 除了基本类型，其余的默认值都是null
     */
    String myName;
    int age;


    /**
     * Main 方法
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * int a, b, c;
         * 不建议这样新建变量 程序可读性
         * int a = 1, b = 2, c = 3;
         *
         */
        String name = "yanqs";
        char x = 'x';
        double d = 3.14;

        /**
         * 局部变量：必须声明和初始化值
         * 生命周期只在当前方法内
         */
        int i = 10;
        System.out.println(i);

        // 变量类型 变量名字=new Demo05();
        // 如果没有初始化，会输出默认值
        Demo05 demo05 = new Demo05();
        System.out.println(demo05.myName);
        System.out.println(demo05.age);

        //类变量输出
        System.out.println(salary);

    }

    /**
     * 其他方法
     */
    public void add() {
        //System.out.println(i);
    }
}
