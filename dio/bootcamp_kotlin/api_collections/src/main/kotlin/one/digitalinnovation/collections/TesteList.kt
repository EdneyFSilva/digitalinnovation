package one.digitalinnovation.collections

fun main() {
    val paula = Funcionaio("Paula",1500.0, "CLT")
    val joao = Funcionaio("João",2800.0, "PJ" )
    val maria = Funcionaio("Maria",1251.0, "CLT" )

    val funcionarios = listOf(paula,joao,maria)

    funcionarios.forEach {  println(it)}

    println("-- Pesquisando um funcionário na lista ---")
    println(funcionarios.find { it.nome == "Maria" })

    println("-- Imprimindo funcionário da lista em ordem de salario, usando encadeamdnto de funções Kotlin ---")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("-- Imprimindo funcionário da lista agrupados por tipo de contrato, usando encadeamdnto de funções Kotlin ---")
    funcionarios.groupBy { it.tipo }.forEach { println(it) }
}

data class Funcionaio (
    val nome: String,
    val salario: Double,
    val tipo: String

) {
    override fun toString(): String =
        """
        Nome: $nome
        Salario: $salario
        """.trimIndent()
}