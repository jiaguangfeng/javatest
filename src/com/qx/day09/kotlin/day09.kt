package com.qx.day09.kotlin


fun main() {
    val utils = Utils()
    println(Utils.name)
    utils.printName()

    println("-------------------------------")
    val cat: Cat = BigCat()
    cat.eat()

    println("-------------------------------")
    val user = User()
    user.adduser()
}