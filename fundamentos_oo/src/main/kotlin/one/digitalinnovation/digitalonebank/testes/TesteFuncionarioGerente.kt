package one.digitalinnovation.digitalonebank.testes

import one.digitalinnovation.digitalonebank.Analista
import one.digitalinnovation.digitalonebank.Funcionario
import one.digitalinnovation.digitalonebank.Gerente
import one.digitalinnovation.digitalonebank.ImprimeRelatorioFuncionario
import java.math.BigDecimal

fun main(){
    val farias = Gerente(nome = "Farias", cpf = "000.000.000-00", 1100.56,senha = "pwd123x")

    ImprimeRelatorioFuncionario.imprime(farias)

    TesteAutenticacao().antenticacao(farias)
}