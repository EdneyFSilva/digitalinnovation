package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    println("-- iterando pelo valor do array")
    for (valor in values) {
        println(valor)
    }
    // iterando pelo indice do array
    println("-- iterando pelo indice do array")
    for (index in values.indices) {
        println(values[index])
    }

    println("-- iterando pela expressão lampida do kotlin declarada assim")
    //expressão lampida do kotlin declarada assim
    values.forEach {
        println(it)
    }
    println("-- ou iterando nomeando a variável de referencia no lugar da referencia 'it'")
    // ou nomeando a variável de referencia no lugar da referencia 'it'
    values.forEach { valor ->
        println(valor)
    }
    println("-- Ordenando o array")
    values.sort()
    for (valor in values) {
        println(valor)
    }

}