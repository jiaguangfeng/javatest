package com.qx.day08.kotlin

import java.util.*


fun main(args: Array<String>) {

    val arr = intArrayOf(11, 22, 33, 44)

    print("[")
    for (i in arr.indices) {
        if (i == arr.size - 1) {
            println(arr[i].toString() + "]")
        } else {
            print(arr[i].toString() + ", ")
        }
    }

    println("-------------------------------")
    println(Arrays.toString(arr))

    println("-------------------------------")
    println("现在放学了")
    goHome("大熊")
    goHome("净香")
    goHome("小夫")
}


fun goHome(name: String) {
    println(name + "回家了")
}
