package com.shawn.kotlin

import java.util.*

data class Ticket(val origin: Int, val destation: Int, val price: Int)

fun main() {
    // data class 由於 data class 本身的限制，如果要繼承和擴充，應改用一般類別
    var ticket = Ticket(20, 51, 420)
    // Extensions 擴充
    val s = "abcdefg"
    println(s.validate())
    println((1..10).random())
}

fun String.validate() = this.length >= 6

fun IntRange.random() = Random().nextInt(endInclusive - start) + start