package com.qx.day05


fun main() {

    val arr = intArrayOf(13, 26, 22, 22, 35, 18) //要进行排序的数组

    val res = day05.bubbleSort(arr) as IntArray //获取到排序后到数组


    //循环遍历出内容
    for (i in res) {
        println(i)
    }
}

fun bubbleSort(arr: IntArray): IntArray? {
    var temp: Int //定义一个临时变量
    for (i in 0 until arr.size - 1) { //冒泡趟数
        for (j in 0 until arr.size - i - 1) { //如果顺序不对，则交换两个元素
            if (arr[j + 1] < arr[j]) {
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    return arr
}