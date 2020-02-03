package com.qx.day12.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class List01 {

    public static void main(String[] args) {
        //三种创建集合
        Collection list = new ArrayList();
        List list1 = new ArrayList();
        ArrayList list2 = new ArrayList();


        //添加
        ((ArrayList) list).add("qx");
        ((ArrayList) list).add("jx");
        System.out.println(list);
        //删除
//        list.remove("qx");
        System.out.println(list);


        Boolean l = Arrays.asList(list).toString().contains("qx");
        System.out.println(Arrays.asList(list).toString());
        System.out.println(l);

        //截取@后面的字段
        String email="asdasdasd@qwe.com";
        String suffix = email.substring(email.indexOf("@") + 1, email.length());
        System.out.println(suffix);


    }
}
