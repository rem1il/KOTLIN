package Kotlin

fun main() {
    println(diff('A', 'Z'))
}

fun diff(char1: Char, char2: Char): Int {
    return char1.code - char2.code
}
