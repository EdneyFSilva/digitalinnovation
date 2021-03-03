package one.digitalinnovation.digitalonebank.testes

import one.digitalinnovation.digitalonebank.Funcionario
import java.math.BigDecimal

fun main(){
    val edney = Funcionario(nome = "Edney", cpf = "000.000.000-00", BigDecimal(1100.56))
    println("${edney.nome} - ${edney.cpf} - ${edney.salario}")
}