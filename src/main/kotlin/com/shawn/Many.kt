package com.shawn

fun main() {
    // Kotlin 除了復刻 Java 的常見類別外，還增加許多功能和提供直接使用的上層方法
    // Kotlin Collections 產生的物件分為 Immutable 和 Mutable
    // Immutable
    val list = listOf(5, 1, 2, 7)
    println(list)
    val scores = listOf(68, 88, 77, 99, 50)
    for (score in scores) {
        println(score)
    }
    println(list.get(3))

    // Mutable
    val mutableList = mutableListOf(5, 1, 2, 7)
    mutableList.add(6)
    println(mutableList)
}