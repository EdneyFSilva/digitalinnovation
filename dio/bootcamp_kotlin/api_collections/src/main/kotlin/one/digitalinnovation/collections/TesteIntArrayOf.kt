package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf( 10, 2, 3, 5, 7, 4, 1)
    values.forEach {
        println(it)
    }

    println(" -- Ordenado lista de array")
    values.sort()
    values.forEach {
        println(it)
    }

}