package com.shawn

import java.io.File

fun main() {
    read()
    // write()
}

private fun read() {
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }
}

private fun write() {
    // 1. Kotlin
    // File("output.txt").writeText("abc123")

    // 2. 使用 use 可以自動 flush() & close()
    // File("output.txt").printWriter().use {
    //     it.println("1st line")
    //     it.println("2nd line")
    //     it.println("3rd line")
    // }

    // 3. 寫大量資料時，推薦使用
    File("output.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2nd line\n")
        it.write("3rd line\n")
    }
}