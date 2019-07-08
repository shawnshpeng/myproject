package com.shawn.kotlin

import java.util.*

fun main() {
    // userInput()
    val student = Student("Shawn", 77, 99)
    student.print()
    println("High Score: ${student.highest()}")
}

class Student(var name: String?, var english: Int, var math: Int) {
    fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    fun grading() = when (getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    fun passOrFailed() = if (getAverage() >= 60) "PASS" else "FAILED"

    fun getAverage() = (english + math) / 2

    fun highest() = if (english > math) {
        println("english")
        // Kotlin 方法區塊最後一行的值會被運算結果回傳
        english
    } else {
        println("math")
        math
    }

    fun nameCheck() = name?.length
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name: ")
    // var name = scanner.next()
    var name = null
    print("Please enter student's english: ")
    var english = scanner.nextInt()
    print("Please enter student's math: ")
    var math = scanner.nextInt()
    val student = Student(name, english, math)
    student.print()
    student.nameCheck()
}
