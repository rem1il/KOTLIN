package Kotlin

fun main() {
    println("введите число элементов первого множества")
    val a = readLine()!!.toInt()

    println("введите число элементов второго множества")
    val b = readLine()!!.toInt()

    val set1 = mutableSetOf<String>()
    val set2 = mutableSetOf<String>()

    println("Введите элементы первого множества:")
    for (i in 0 until a) {
        set1.add(readLine()!!.trim())
    }

    println("Введите элементы второго множества:")
    for (i in 0 until b) {
        set2.add(readLine()!!.trim())
    }

    val unionSet = set1 union set2

    println("Объединённое множество: ${unionSet.joinToString(", ")}")
}
