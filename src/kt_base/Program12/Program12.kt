package Kotlin

fun main() {
    println("Введите число:")
    val n = readLine()!!.toInt()

    for (i in 2 until n) {
        println(i * 2)
    }
}