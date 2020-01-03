package com.qx.day08.kotlin


class Xiaomi : Phone() {
    fun sendMessage(user: String) {
        println("发消息给$user")
    }
}
