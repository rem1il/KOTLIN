package Kotlin

fun main() {
    println("Введите длину списка:")
    val a = readLine()!!.toInt()

    val list = ArrayList<String>()
    for (i in 0 until a) {
        val element = readLine()!!.trim()
        list.add(element)
    }

    val uniqueList = list.distinct()

    println(uniqueList.joinToString(", "))
}
