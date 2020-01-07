package com.qx.day12.java;

import java.util.ArrayList;
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
        list.remove("qx");
        System.out.println(list);
    }
}
