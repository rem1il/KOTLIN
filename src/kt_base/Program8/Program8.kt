package Kotlin

fun main() {
    println("Введите возраст:")
    val age = readLine()?.toInt()

    if (age == null || age < 0) {
        println("Некорректное значение")
    } else if (age >= 18) {
        println("Совершеннолетний")
    } else {
        println("Несовершеннолетний")
    }
}
