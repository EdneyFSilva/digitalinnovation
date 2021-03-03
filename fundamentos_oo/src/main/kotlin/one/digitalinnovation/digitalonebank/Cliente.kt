package one.digitalinnovation.digitalonebank

class Cliente (nome:String,
               cpf:String,
               val clienteTipo:ClienteTipo,
                val senha:String) : Pessoa(nome,cpf), Logavel {

    override fun login(): Boolean = "pwdabc" == senha

    override fun toString(): String = """
    Nome: $nome
    CPF: $cpf
    Tipo: ${clienteTipo.descricao}
    """.trimIndent()
}