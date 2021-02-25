package one.digitalinnovation.digitalonebank

class Pessoa {
    var nome:String = "Edney"
    var cpf:String = "000.000.000-00"

    inner class endereco{
        var rua:String = "Rua 8"
    }
}

fun main(){
    var edney = Pessoa()
    edney.cpf = "406.285.232-15"
    println(edney.nome)
    println(edney.cpf)
    println(edney.endereco().rua)
}