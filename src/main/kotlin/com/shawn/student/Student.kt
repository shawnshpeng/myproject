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
        println(name + "\t" + english + "\t" + math + "\t" + (english + math) / 2)
    }

    fun highest(): Int {
        var max = if (english > math) {
            println(english)
            // Kotlin 方法區塊最後一行的值會被運算結果回傳
            english
        } else {
            println(math)
            math
        }
        return max
    }

    fun nameCheck() {
        println(name?.length)
    }
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
