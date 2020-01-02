package com.qx.day07;

public class day07 {

    public static void main(String[] args) {
        printText();
        System.out.println(printTextForTitle("这个是带返回值的方法"));
    }

    protected static void printText() {
        System.out.println("这个是没有返回值的方法");
    }

    protected static String printTextForTitle(String title){

        return title;
    }
}
