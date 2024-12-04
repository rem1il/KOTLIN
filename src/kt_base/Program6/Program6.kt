package Kotlin

fun main() {
    print(deleteAndAdd("баобаб"))
}

fun deleteAndAdd(input: String): String {
    val charArray = input.toCharArray()
    return String(charArray.drop(2).toCharArray()) + String(charArray.take(2).toCharArray())
}


