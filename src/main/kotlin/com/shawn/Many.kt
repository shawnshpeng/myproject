package com.shawn

import java.time.LocalDateTime

fun main() {
    val parkingLot = hashMapOf<String, Car?>()
    var enter = LocalDateTime.of(2019, 12, 25, 8, 0, 0)
    var car: Car? = Car("AAA-0001", enter)
    parkingLot.put(car!!.id, car)

    car = Car("BBB-0002", enter.plusMinutes(15))
    parkingLot.put(car.id, car)

    // Car 1 leaving
    var leave = LocalDateTime.of(2019, 12, 25, 9, 0, 0)
    car = parkingLot.get("AAA-0001")
    car?.leave = leave
    println("${car?.id} duration: ${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)

    // Car 2 leaving
    car = parkingLot.get("BBB-0002")
    car?.leave = leave.plusHours(2)
    println("${car?.id} duration: ${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)

    /*// Kotlin 除了復刻 Java 的常見類別外，還增加許多功能和提供直接使用的上層方法
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
    println(mutableList)*/
}