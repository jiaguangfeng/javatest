package com.qx.day17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {


    public static void main(String args[]) {
        String str = " " ;
        String pattern1 = "(([a-zA-Z\\u4e00-\\u9fa5]+,?/?)+ <[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])>)";

        String pattern = "((([a-zA-Z\\u4e00-\\u9fa5]+,?/?)+)? (<[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])>)?)";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
//        System.out.println(m.find()+"1111");

        while(m.find()){
            //获取 字符串
            System.out.println(m.group());
            //获取的字符串的首位置和末位置
            System.out.println(m.start()+"--"+m.end());
        }
    }
}
