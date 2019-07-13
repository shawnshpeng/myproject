package com.shawn

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main() {
    Thread({
        for (i in 1..10) {
            println("Thread: ${i}")
            Thread.sleep(50)
        }
    }).start()

    // 建議使用
    thread {
        for (i in 1..10) {
            println("thread() ${i}")
            Thread.sleep(50)
        }
    }

    // Kotlin Coroutine
    GlobalScope.launch {
        for (i in 1..10) {
            println("Coroutines: ${i}")
            delay(50L)
        }
    }
}