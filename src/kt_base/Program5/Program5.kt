package Kotlin

fun main() {
    val words = ArrayList<String>()

    repeat(5) { index ->
        println("Введите строку ${index + 1}:")
        val userInput = readLine() ?: ""
        words.add(userInput)
    }

    val combinedText = words.joinToString("")
    println("Объединённая строка: $combinedText")
}
