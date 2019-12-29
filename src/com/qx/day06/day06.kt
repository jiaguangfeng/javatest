package com.qx.day06

import java.util.*
fun main() {
    val ints = IntArray(3)
    ints[0] = 1
    ints[1] = 2
    ints[2] = 3
    val ints1 = intArrayOf(1, 12, 13)
    var mutableList = mutableListOf(1,2,3,4)
    val linklist: List<*> = LinkedList<Any?>()
    val hashset: Set<*> = HashSet<Any?>()
    val treeset: Set<*> = TreeSet<Any?>()
    val hashmap: Map<*, *> = HashMap<Any?, Any?>()
    val treemap: Map<*, *> = TreeMap<Any?, Any?>()
//    for (p in ints.indices) {
//        println(ints[p])
//    }
//    for (o in ints1.indices) {
//        println(ints[o])
//    }

    mutableList.add(5)
    mutableList.add(6)

//    for(index in 0 until mutableList.size-1){
//        println(mutableList[index])
//    }

    for (ele in mutableList){
        println(ele)
    }

}



