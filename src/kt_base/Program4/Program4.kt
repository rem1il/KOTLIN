package Kotlin

fun main() {
    Unicode('v')
}

fun Unicode(a: Char) {
    val upper = a.uppercaseChar()
    val unicodeValue = upper.code
    println(unicodeValue)
}
