package com.shawn

fun main() {
    // println("Hello Kotlin")
    val human = Human()
    human.hello()
    /*
     * 參考資料型態：Byte Short Int Long Float Double Char Boolean String
     */
    var age = 19
    age = 20
    var weight = 66.5f
    var name: String
    name = "Shawn"
}

class Human {
    fun hello() {
        println("Hello Kotlin")
    }
}