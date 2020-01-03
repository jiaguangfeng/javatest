package com.qx.day10.java;

public class day10 {
    public static void main(String[] args) {

        Cat cat = new Bigcat();
        cat.eat();
        cat.like();

        Heart heart =new day10().new Heart();
        heart.beat();
    }

    // TODO:  自己拓展
    class Heart{
        //内部类的方法
        void beat(){
            System.out.println("我叫内部类中的方法");
        }

    }
}
