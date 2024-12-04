package Kotlin

fun main() {
    println("Введите число элементов первого множества:")
    val a = readLine()!!.toInt()

    println("Введите число элементов второго множества:")
    val b = readLine()!!.toInt()

    val set1 = mutableSetOf<Int>()
    val set2 = mutableSetOf<Int>()

    println("Введите элементы первого множества:")
    for (i in 0 until a) {
        set1.add(readLine()!!.toInt())
    }

    println("Введите элементы второго множества:")
    for (i in 0 until b) {
        set2.add(readLine()!!.toInt())
    }

    val intersectionSet = set1 intersect set2

    if (intersectionSet.isNotEmpty()) {
        println("Общие элементы: ${intersectionSet.joinToString(", ")}")
    } else {
        println("Нет общих элементов")
    }
}