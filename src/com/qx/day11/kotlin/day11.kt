package com.qx.day11.kotlin

import java.text.SimpleDateFormat
import java.util.*


fun main() {
    val a = "123"
    val b = "123"
    if (a == b) {
        println("a和b 一样")
    } else {
        println("a和b不一样")
    }
    val simpleDateFormat = SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss")
    val format = simpleDateFormat.format(Date())
    println(format)
    val stringBuffer = StringBuffer()
    stringBuffer.append("hello")
    stringBuffer.append(',')
    stringBuffer.append(97)
    stringBuffer.append(33.33)
    stringBuffer.append("你哈哈,java~")
    println(stringBuffer.toString())
}

