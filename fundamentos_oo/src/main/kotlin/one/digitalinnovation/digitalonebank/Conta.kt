package one.digitalinnovation.digitalonebank

import java.math.BigDecimal

class Conta(
    val agenda:String,
    val conta:String,
    val saldo:BigDecimal
) {
    fun deposito(valor:BigDecimal){
        println(valor)
    }

    fun saque(valor:BigDecimal){
        println(valor)
    }
}