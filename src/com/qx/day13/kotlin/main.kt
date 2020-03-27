package com.qx.day13.kotlin

fun main() {
    //最开始的
    println("hello world!")
    //
    print(sum(3, 3))

    sum1(2, 2)
    println(maxOf(2,2))
}

//一个带返回值的方法

fun sum(a: Int, b: Int): Int {
    return a + b

}


fun sum1(a: Int, b: Int) {

    print("sun  : ${a + b}")
}
//val  只能赋值一次   var 可以重新赋值

fun maxOf(a: Int, b: Int) = if (a > b) a else b
