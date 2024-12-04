package Kotlin

fun main() {
    average()
}

fun average() {
    println("Введите три числа с плавующей точкой")
    val a = readLine()?.toDouble()
    val b = readLine()?.toDouble()
    val c = readLine()?.toDouble()

    val average = (a!! + b!! + c!!)/3

    println("Среднее арифметическое: $average")
}