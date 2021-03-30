package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(10000.0,5000.0,2500.0)
    salarios.forEach {
        println(it)
    }
    println("-- Menor salarios encontrado --- ")
    println(salarios.minOrNull())
    println("-- Maior salarios encontrado --- ")
    println(salarios.maxOrNull())
    println("-- Média dos salarios encontrado --- ")
    println(salarios.average())

    println("-- Filtrando salarios menores ou iguais a 5 mil --- ")
    val salariosFiltradosMenos5k = salarios.filter { it <= 5000.0 }
    salariosFiltradosMenos5k.forEach {println(it)}

    println("-- Filtrando qtde de salarios entre intervalo (Range) --- ")
        println(salarios.count { it in 2000.0..5000.0})

    println("-- Pesquisando salarios especifico e imprime o valor--- ")
    println(salarios.find { it == 5000.0})

    println("-- Pesquisando salarios especifico e imprime true ou false--- ")
    println(salarios.any { it == 1000.0})

}