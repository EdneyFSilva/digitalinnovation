package one.digitalinnovation.digitalonebank

class Pessoa {
    var nome:String = "Edney"
    var cpf:String = "000.000.000-00"
        // tornando o set do atributo private, o mesmo pode ser feito para o get,
        // dessa forma ajuda no controle de get/set
        private set

    inner class Endereco{
        var rua:String = "Rua 8"
        var num:Int = 33
    }

    constructor()

    fun uniNomeCpf() = "$nome e $cpf"

}

fun main(){
    val edney = Pessoa()
    edney.nome = "Joca"
    //edney.cpf = "406.285.232-15"
    println(edney.nome)
    println(edney.cpf)
    println(edney.Endereco().rua)
    println(edney.Endereco().num)
    println(edney.uniNomeCpf())
}