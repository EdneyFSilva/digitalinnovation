package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 3000.0
    salarios[1] = 1000.0
    salarios[2] = 500.0

    salarios.forEach { println(it) }

    println("-- Reajuste dos salarios de 10% ---")
    salarios.forEachIndexed { index, salario ->
    salarios[index] = salario * 1.1}

    salarios.forEach { println(it) }

    println("-- Salarios 2 e mostra em ordem decrescente---")
    val salarios2 = doubleArrayOf(123.4, 1500.9, 2500.2, 850.1)
    salarios2.sortDescending()
    salarios2.forEach { println(it) }

}