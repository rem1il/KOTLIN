package Kotlin

fun main() {
    val a: String? = "шримпролл"
    val length = a?.length

    if ( length != null) {
        println("Длина строки: $length")
    } else {
        println("Строка равна нулю")
    }
}
