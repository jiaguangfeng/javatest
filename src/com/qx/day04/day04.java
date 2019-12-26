package com.qx.day04;

public class day04 {

    public static void main(String[] args) {
        //判断  固定的if else  if后面的口号中放 条件  即返回值为 boolean  类型
        if (true) {//口号中是条件
            //当条件当返回值是true 是执行这当语句
            System.out.println("条件为true");
        } else {
            //当条件不为true 执行这里当语句
            System.out.println("条件为false");
        }
        //定义条件变量
        //while(条件){
        //	语句块
        //	条件变量改变
        //}
        // TODO:  这里有个+=的用法 自己学习
        int sum = 0, pp = 0;
        while (pp < 101) {
            sum += pp;
            pp++;
        }
        System.out.println("1加到100的和为:" + sum);

        int days = 0;//用来记录天数
        int year = 2019;//默认当年数
        //fori 循环   第一个是初始值  第二个是停止当条件（这个循环中i 必须小于10） 第三个是增长值
        for (int i = 0; i < 13; i++) {
            //  switch () 括号里面 只能是char 类型 或者 int 类型  新的jdk 好像改了   case 是匹配到的值  结束一定要加break ；
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    //判断是否为闰年
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        //闰年2月29天
                        days = 29;
                    } else {
                        days = 28;
                    }
            }
            //输出结果
            System.out.println(year + "年" + i + "月的天数为:" + days + "天");

        }

        // foreack 循环   类型  名字 ：  集合 数组 对象
        int[] p = {1, 2, 4, 6, 2, 7, 5, 5, 8};
        for (int ii : p) {
            System.out.println(ii);
        }

        // TODO:  在循环中还有几个关键字   break  continue  了解一下

    }
}
