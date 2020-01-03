package com.qx.day08.java;

import java.util.Arrays;

public class day08 {
    public static void main(String[] args) {
        /**
         * 面向过程:当需要实现一个功能的时候,
         * 每一个具体的步骤都要亲力亲为,详细处理每一个细节
         * 面向对象:当需要实现一个功能的时候,
         * 不关心具体的步骤,而是找一个已经具有该功能的
         * 人,来帮我做事儿
         */
        int[] arr = {11, 22, 33, 44};

        //要求打印格式为:[11,22,33,44]
        //使用面向过程
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //判断是否为最后一个元素
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        /**
         *  使用面向对象
         *  找一个JDK给我们提供好的Arrays类
         *  直接就能把数组变成想要的字符串
         */

        System.out.println("-------------------------------");
        System.out.println(Arrays.toString(arr));


        /**
         * 面向对象特点 封装
         *
         *  用于要写两次活着更多的一样代码  你可以封装到一个方法中 进行调用
         */
        System.out.println("-------------------------------");
        System.out.println("现在放学了");
        goHome("大熊");
        goHome("净香");
        goHome("小夫");


        /**
         *  继承
         *  子类调用父类的方法 但父类不能掉子类方法
         *
         */

        System.out.println("-------------------------------");

        Phone phone = new Phone();    //这里 就是 初始化一个对象  你要使用 必须先new 一个出来
        phone.call("胖子");
        // phone.sendMessage("胖子");  这个方法压根找不到

        System.out.println("-------------------------------");

        Xiaomi xiaomi = new Xiaomi();
        xiaomi.call("大熊");
        xiaomi.sendMessage("大熊");

    }


    private static void goHome(String name) {

        System.out.println(name + "回家了");
    }
}
