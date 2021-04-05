package one.digitalinnovation.collections

fun main() {
    val paula = Funcionaio("Paula", 1500.0, "CLT")
    val joao = Funcionaio("João", 2800.0, "PJ")
    val maria = Funcionaio("Maria", 1251.0, "CLT")

    val funcionarios = mutableListOf(paula, joao)
    funcionarios.forEach { println(it) }

    println("-- Adicionando um novo funcionario na lista ---")
    funcionarios.add(maria)
    funcionarios.forEach { println(it) }

    println("-- Removendo um funcionario da lista ---")
    funcionarios.remove(paula)
    funcionarios.forEach { println(it) }

    println("-- SET ---")
    val funcionariosSet = mutableSetOf(paula, maria)
    funcionariosSet.forEach { println(it) }

    println("-- Adicionando SET ---")
    funcionariosSet.add(joao)
    funcionariosSet.forEach { println(it) }

    println("-- Removendo SET ---")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }
}