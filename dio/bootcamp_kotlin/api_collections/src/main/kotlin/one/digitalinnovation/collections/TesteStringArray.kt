package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "André"
    nomes.forEach {
        println(it)
    }

    println(" -- Ordenado lista de array")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println(" -- Ordenado lista de array ordenada e impressa direta usando função lambida do kotlin")
    val nomes2 = arrayOf("Mario","João","Claudia")
    nomes2.sort()
    nomes2.forEach { println(it) }
}