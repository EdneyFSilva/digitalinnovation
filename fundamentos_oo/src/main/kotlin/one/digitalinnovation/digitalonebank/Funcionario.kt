package one.digitalinnovation.digitalonebank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
        ) : Pessoa(nome, cpf) {
    protected abstract fun calculoauxilio() : Double

    override fun toString(): String = """
    Nome: $nome
    CPF: $cpf
    Salário: $salario
    Auxílio HM: ${calculoauxilio()}
    """.trimIndent()
}