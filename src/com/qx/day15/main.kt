package com.qx.day15

fun main(args: Array<String>) {

    val text: String? = null;
    val length = text?.length
    System.out.println(length)

    val text1 = """
        |First Line
        |Second Line
        |Third Line
            """.trimMargin()
    System.out.println(text1)

}