package com.qx.day11.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class day11 {
    public static void main(String[] args) {
        String a = "123";
        String b = "123";

        if (a.equals(b)) {
            System.out.println("a和b 一样");
        } else {
            System.out.println("a和b不一样");

        }

        //获取当前时间
        //格式化的字符串传给的是构造方法
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss"); // TODO: 这个时间格式自己研究
        //格式化只需要传一个Date实例即可
        String format = simpleDateFormat.format(new Date());

        System.out.println(format);



        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hello");
        stringBuffer.append(',');
        stringBuffer.append(97);
        stringBuffer.append(33.33);
        stringBuffer.append("你哈哈,java~");
        System.out.println(stringBuffer.toString());

    }
}
