package one.digitalinnovation.digitalonebank

class Gerente (nome:String,
              cpf:String,
              salario:Double,
               val senha:String) : Funcionario(nome=nome,cpf=cpf,salario=salario), Logavel {
    override fun calculoauxilio(): Double = salario * 0.3

    override fun login(): Boolean = "pwd123" == senha
}