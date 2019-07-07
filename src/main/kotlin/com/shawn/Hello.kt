package com.shawn

fun main() {
    // println("Hello Kotlin")
    val human = Human(66.5f, 1.7f)
    human.hello()
    println(human.bmi())
    /*
     * 參考資料型態：Byte Short Int Long Float Double Char Boolean String
     */
    var age = 19
    age = 20
    var weight = 66.5f
    var name: String
    name = "Shawn"
}

class Human(var weight: Float, var height: Float) {

    fun bmi(): Float {
        val bmi = weight / (height * height)
        return bmi
    }

    fun hello() {
        println("Hello Kotlin")
    }
}