package Kotlin

fun main() {
    print("Введите элементы списка через запятую: ")
    val inputString = readLine()!!
    val elements = inputString.split(",").map { it.trim() }

    val elementCount = mutableMapOf<String, Int>()
    for (i in elements) {
        elementCount[i] = (elementCount[i] ?: 0) + 1
    }

    println("Результат: $elementCount")
}