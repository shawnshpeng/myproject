package com.shawn.kotlin

import java.util.*

fun main() {
    // userInput()
    Student.pass = 50
    val student = Student("Shawn", 60, 99)
    val student2 = Student("Shawn", 44, 68)
    val student3 = Student("Shawn", 30, 49)
    val graduateStudent = GraduateStudent("Jack", 55, 65, 60)
    graduateStudent.print()
    student.print()
    student2.print()
    student3.print()
    println("High Score: ${student.highest()}")
}

class GraduateStudent(name: String?, english: Int, math: Int, var thesis: Int) : Student(name, english, math) {
    companion object {
        var pass = 70
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"
}

open class Student(var name: String?, var english: Int, var math: Int) {
    // 類似 Java 的 static
    companion object {
        @JvmStatic
        var pass = 60

        fun test() {
            println("testing")
        }
    }

    open fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    fun grading() = when (getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    open fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"

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
