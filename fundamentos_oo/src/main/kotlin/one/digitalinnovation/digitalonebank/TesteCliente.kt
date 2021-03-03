package one.digitalinnovation.digitalonebank

import one.digitalinnovation.digitalonebank.Analista
import one.digitalinnovation.digitalonebank.Funcionario
import one.digitalinnovation.digitalonebank.Gerente
import one.digitalinnovation.digitalonebank.ImprimeRelatorioFuncionario
import one.digitalinnovation.digitalonebank.testes.TesteAutenticacao
import java.math.BigDecimal

fun main(){
    val mario = Cliente(nome = "Mario",
                        cpf = "000.000.000-00",
                        clienteTipo = ClienteTipo.PF,
                        senha = "pwdabc")

    println(mario)

    TesteAutenticacao().antenticacao(mario)
}