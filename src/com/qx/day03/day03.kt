package com.qx.day03

fun main() {
    println("9.5<8 :" + (9.5 < 8))
    println("8.5<=8.5:" + (8.5 <= 8.5))
    println("a~z：" + 'a'.toInt() + "~" + 'z'.toInt())
    println("A~Z：" + 'A'.toInt() + "~" + 'Z'.toInt())
    println("'A' < 'a':" + ('A' < 'a'))

    if (9 > 3 || 3 > 9) {
        println("执行if")
    } else {
        println("执行else")
    }

    if (9 < 3 || 3 > 9) {
        println("执行if")
    } else {
        println("执行else")
    }

    if (9 > 3 && 3 > 9) {
        println("执行if")
    } else {
        println("执行else")
    }

    if (9 > 3 && 3 < 9) {
        println("执行if")
    } else {
        println("执行else")
    }

}