package one.digitalinnovation.digitalonebank.testes

import one.digitalinnovation.digitalonebank.Analista
import one.digitalinnovation.digitalonebank.Funcionario
import one.digitalinnovation.digitalonebank.ImprimeRelatorioFuncionario
import java.math.BigDecimal

fun main(){
    val edney = Analista(nome = "Edney", cpf = "000.000.000-00", 1100.56)

    ImprimeRelatorioFuncionario.imprime(edney)
}

