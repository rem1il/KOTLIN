package Kotlin

fun main() {
    println("Введите число:")
    val a = readLine()!!.toInt()

    if (a % 2 == 0) {
        println("Чётное число")
    } else {
        println("Нечётное число")
    }
}
