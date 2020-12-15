package com.qx.day16



fun main() {
    val test:String=""

    System.out.println(len(test))

    val result = with(StringBuffer()){
        for (tes in list){
            append(tes)
        }
        append("aaaaa").toString()

    }
    System.out.println(result)

}
fun len(test:String):Int{
    return test?.length
}


val  list = listOf<String>("aaaa","bbbb","ccc")


fun main(args: Array<String>) {
    val result = "testLet".let {
        println(it.length)
        1000
    }

    val result1 = run {
//        println("my name is 11, I am  11 years old, my phone number is 11")
        1000
    }
    println(result1)
}