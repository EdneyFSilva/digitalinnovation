package one.digitalinnovation.collections

fun main() {
    val paula = Funcionaio("Paula", 1500.0, "CLT")
    val joao = Funcionaio("João", 2800.0, "PJ")
    val maria = Funcionaio("Maria", 1251.0, "CLT")

    val repositorio = Repositorio<Funcionaio>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(paula.nome, paula)

    println("-- find by id and print funcionario ---")
    println(repositorio.findById(maria.nome))

    println("-- find all funcionarios and print ---")
    //println(repositorio.findAll())
    // ou
    repositorio.findAll().forEach { println(it) }

    println("-- removendo funcionario and print ---")
    repositorio.removeById(joao.nome)
    repositorio.findAll().forEach { println(it) }
}