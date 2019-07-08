package com.shawn

fun main() {
    // "型態?"（Safe Call）允許空值的型態，可防止 NullPointerException
    // 如果需要自己來處理 Exception，可使用"型態!!"（Not-Null assertion）
    var s: String? = "abcde"
    s = null
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(3))
    // println("Hello Kotlin")
    // 寫法1
    // val human = Human(66.5f, 1.7f)
    // 寫法2 可以指定參數做設定
    val human = Human(weight = 66.5f, height = 1.7f)
    human.hello()
    println(human.bmi())
    val score = 88
    println(score > 60)
    // Kolin 字元不能做數值，若與數值比較必須轉型
    val c = 'A'
    println(c.toInt() > 60)
    /*
     * 參考資料型態：Byte Short Int Long Float Double Char Boolean String
     */
    var age = 19
    age = 20
    var weight = 66.5f
    var name: String
    name = "Shawn"
}

// Primary Constructor：可省略 constructor 關鍵字；參數可以有預設值=>比較不重要的參數放後面
// 寫法1
// class Human(weight: Float, var height: Float, var name: String = "") {
// 寫法2
class Human(var name: String = "", var weight: Float, var height: Float) {
    // Primary Constructor 的程式碼區塊
    init {
        println("test $weight")
    }

    // Secondary Constructor：不可用 var/val 關鍵字；使用到 Primary 的參數，要用 this 呼叫
    // constructor(name: String, weight: Float, height: Float) : this(weight, height)

    fun bmi(): Float {
        val bmi = weight / (height * height)
        return bmi
    }

    fun hello() {
        println("Hello Kotlin")
    }
}