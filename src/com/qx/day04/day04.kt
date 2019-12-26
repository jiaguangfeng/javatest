package com.qx.day04

fun main() {
    if (true) {
        println("条件为true")
    } else {
        println("条件为false")
    }


    var sum = 0
    var pp = 0
    while (pp < 101) {
        sum += pp
        pp++
    }
    println("1加到100的和为:$sum")

    var days = 0

    val year = 2019

    for (i in 0..12) {
        when (i) {
            1, 3, 5, 7, 8, 10, 12 -> days = 31
            4, 6, 9, 11 -> days = 30
            2 ->
                days = if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { //闰年2月29天
                    29
                } else {
                    28
                }
        }

        println(year.toString() + "年" + i + "月的天数为:" + days + "天")
    }


    val p = intArrayOf(1, 2, 4, 6, 2, 7, 5, 5, 8)
    for (ii in p) {
        println(ii)
    }


}