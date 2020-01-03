package com.qx.day09.java;

public class day09 {
    private static int idCounter = 0;//学号计数器

    public static void main(String[] args) {

        //一旦使用了static关键字,name这样的内容不再属于对象自己,而是属于类的,所以凡是本类的对象,都能共享同一份
        //一旦用static修饰,就变成了静态方法,静态方法属于类
        //静态方法可以直接通过类名称调用
        //静态代码块 静态内容总是优先于非静态,所以静态代码块比构造方法先执行

        Utils utils = new Utils();
        System.out.println(Utils.name);
        utils.printName();

        System.out.println("-------------------------------");
        Cat cat = new BigCat();
        cat.eat();

        System.out.println("-------------------------------");
        User user = new User();
        user.addUser();

        // TODO:  instanceof  这个是一个比较用的多的 自己研究
    }
}
