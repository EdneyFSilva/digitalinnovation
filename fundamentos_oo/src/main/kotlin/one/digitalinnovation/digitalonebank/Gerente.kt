package one.digitalinnovation.digitalonebank

class Gerente (nome:String,
              cpf:String,
              salario:Double) : Funcionario(nome=nome,cpf=cpf,salario=salario) {
    override fun calculoauxilio(): Double = salario * 0.3
}