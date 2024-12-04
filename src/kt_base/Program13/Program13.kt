package Kotlin

fun main() {
    println("Введите число:")
    val a = readLine()?.toInt()

    if (a != null && a > 0) {
        for (i in a downTo 1) {
            println(i)
            Thread.sleep(500)
        }
        println("Старт")
    } else {
        println("Некорректное значение")
    }
}