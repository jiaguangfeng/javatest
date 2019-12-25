package com.qx.day03;

public class day03 {
    public static void main(String[] args) {

        System.out.println("9.5<8 :" + (9.5 < 8));
        System.out.println("8.5<=8.5:" + (8.5 <= 8.5));
        System.out.println("a~z：" + ((int) 'a') + "~" + ((int) 'z'));
        System.out.println("A~Z：" + ((int) 'A') + "~" + ((int) 'Z'));
        System.out.println("'A' < 'a':" + ('A' < 'a'));//字符'A'的Unicode编码值小于字符'a'


        if (9 > 3 || 3 > 9) {
            System.out.println("执行if");
        } else {
            System.out.println("执行else");
        }

        if (9 < 3 || 3 > 9) {
            System.out.println("执行if");
        } else {
            System.out.println("执行else");
        }

        if (9 > 3 && 3 > 9) {
            System.out.println("执行if");
        } else {
            System.out.println("执行else");
        }

        if (9 > 3 && 3 < 9) {
            System.out.println("执行if");
        } else {
            System.out.println("执行else");
        }

        // TODO:   留一个运算

        System.out.println("9>3 ? :" + (9 > 3 ? true : false));

    }
}
