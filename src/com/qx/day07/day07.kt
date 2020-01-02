package com.qx.day07


fun main() {
    printText()
    println(printTextForTitle("这个是带返回值的方法"))
}

fun printText() {
    println("这个是没有返回值的方法")
}

fun printTextForTitle(title: String?): String? {
    return title
}