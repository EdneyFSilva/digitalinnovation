package one.digitalinnovation.collections

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