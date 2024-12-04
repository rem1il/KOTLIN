package Kotlin

fun main() {
    val result = checkChar('5')
    println(result)
}

fun checkChar(character: Char): Boolean {
    return character.isLetter()
}
