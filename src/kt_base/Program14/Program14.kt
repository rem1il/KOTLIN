package Kotlin

import kotlin.random.Random


fun main() {
    println("Введите число:")
    val a = readLine()?.toInt()


    println("Введите количество элементов массива:")
    val b = readLine()?.toInt()

    val random = Random
    val array = IntArray(b!!)
    for (i in 0 until b) {
        array[i] = random.nextInt(100)
    }

    val isContains = array.contains(a!!)
    println(isContains)
}