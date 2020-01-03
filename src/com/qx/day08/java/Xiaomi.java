package com.qx.day08.java;

public class Xiaomi extends Phone {

    public void sendMessage(String user) {
        System.out.println("发消息给" + user);
    }

    @Override
    public void call(String user) {
        super.call(user);    // TODO: 自己弄明白这里 这个注释会怎么执行  不注释呢
        System.out.println("用小米手机打电话" + user);
    }
}
