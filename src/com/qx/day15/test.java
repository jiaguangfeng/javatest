package com.qx.day15;

public class test1 {

    public static void main(String args[]) {
        test test = new test();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }

    public int aMethod() {
        int i=0;
        i++;
        return i;
    }
}
