package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "1000".toBigDecimal()
    )

    println("-- usando a função somatoria ---")
    println(salarios.somatoria())

    println("-- usando a função media ---")
    println(salarios.media())
}