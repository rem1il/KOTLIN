package Kotlin

import java.util.Arrays

fun main() {
    println("Введите количество элементов массива:")
    val a = readLine()?.toInt()

    println("Введите количество элементов массива:")
    val b = readLine()?.toInt()

    val array1 = IntArray(a!!)
    val array2 = IntArray(b!!)

    for (i in 0 until a) {
        array1[i] = i+1
    }

    for (i in 0 until b) {
        array2[i] = i+1
    }

    val array3 = array1 + array2
    array3.reverse()

    println(Arrays.toString(array3))
}