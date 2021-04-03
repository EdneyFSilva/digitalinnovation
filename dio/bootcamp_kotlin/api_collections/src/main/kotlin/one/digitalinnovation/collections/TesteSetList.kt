package one.digitalinnovation.collections

fun main() {
    val paula = Funcionaio("Paula", 1500.0, "CLT")
    val joao = Funcionaio("João", 2800.0, "PJ")
    val maria = Funcionaio("Maria", 1251.0, "CLT")

    val funcionariosFem = setOf(paula, maria)
    val funcionariosMac = setOf(joao)

    println("-- Unindo duas listas ---")
    val resultFuncionarioGeral = funcionariosFem.union(funcionariosMac)
    resultFuncionarioGeral.forEach { println(it)}

    println("-- Omitindo elementos da lista do sexo Masculino a partir de uma sublista ---")
    val resultFuncionarioSexoFeminino = resultFuncionarioGeral.subtract(funcionariosMac)
    resultFuncionarioSexoFeminino.forEach { println(it)}

    println("-- Omitindo elementos da lista que existe nas duas listas ---")
    val resultFuncionarioIntersect = resultFuncionarioGeral.intersect(funcionariosMac)
    resultFuncionarioIntersect.forEach { println(it)}
}