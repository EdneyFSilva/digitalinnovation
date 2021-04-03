package one.digitalinnovation.collections

fun main() {
    val par: Pair<String, Double> = Pair("João", 36.7)
    val map1 = mapOf(par)
    map1.forEach { (k, v) -> println("chave: $k - Idade: $v") }

    val map2 = mapOf("Pedro" to 35.1,
                     "Maria" to 29.9)
    map2.forEach { (k, v) -> println("chave: $k - Valor: $v") }

}