package controller

import model.Valores

fun main() {
    val List1: Valores = Valores(arrayListOf())
    val List2: Valores = Valores(arrayListOf())

    for (i in 1..5) {
        println("Introduzca valores para lista 1: ")
        List1.numeros.add(readLine()!!.toInt())

    }
    for (i in 1..5) {
        println("Introduzca valores para lista 2: ")
        List2.numeros.add(readLine()!!.toInt())

    }

    var num1 = sumaValores(List1);
    var num2 = sumaValores(List2);


    when {
        num1 > num2 -> println("Lista 1 mayor")
        num1 < num2 -> println("Lista 2 mayor")
        else -> println("Listas iguales")
    }
}

    fun sumaValores(lista: Valores): Int {
        var total = 0;
        lista.numeros.forEach {
            total += it
        }
        return total;
    }



