package one.digitalinnovation.digitalonebank.testes

import one.digitalinnovation.digitalonebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach { it
        println("${it.name} - $it")
    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.descricao}")
}