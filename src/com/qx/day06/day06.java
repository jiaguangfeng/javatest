package com.qx.day06;

import java.util.*;

public class day06 {


    public static void main(String[] args) {
        //数组
        //  数据类型 [] 数组名称 = new 数据类型[长度];
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        //  数据类型 [] 数组名称 = {内容1 ，内容2 。。。。。};
        int[] ints1 = {1, 12, 13};


        //集合
        List arrayList = new ArrayList();
        List linklist = new LinkedList();

        Set hashset = new HashSet();
        Set treeset = new TreeSet();

        Map hashmap = new HashMap();
        Map treemap = new TreeMap();

        //遍历数组ints
        for (int p = 0; p < ints.length; p++) {
            System.out.println(ints[p]);
        }
//遍历数组ints1
        for (int o = 0; o < ints1.length; o++) {
            System.out.println(ints[o]);

        }

        //向list 中  添加数据
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }


}
