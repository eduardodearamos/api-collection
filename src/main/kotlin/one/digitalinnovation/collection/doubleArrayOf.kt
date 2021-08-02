package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(1000.0, 2000.0, 3000.0)

    for (salario in salarios){
        println(salario)
    }

    println("-----------------------------------------------------")
    println("Menor salario: ${salarios.min()}")
    println("Maior salario: ${salarios.max()}")
    println("Media salárial: ${salarios.average()}")
}