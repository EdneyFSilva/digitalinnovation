package one.digitalinnovation.digitalonebank.testes

import one.digitalinnovation.digitalonebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)
    println(digiOneBank.info())
}