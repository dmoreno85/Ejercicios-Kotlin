fun main() {
    var num1 = 0
    var num2 = 0
    for (i in 1..5) {
        println("Introduzca valores para lista 1: ")
        var lista1 = readLine()!!.toInt()
        num1 += lista1;
    }
    for (i in 1..5) {
        println("Introduzca valores para lista 2: ")
        var lista2 = readLine()!!.toInt()
        num2 += lista2
    }
    when {
        num1 > num2 -> println("Lista 1 mayor")
        num1 < num2 -> println("Lista 2 mayor")
        else -> println("Listas iguales")
    }
}