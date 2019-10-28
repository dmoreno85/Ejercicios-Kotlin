fun main() {
    var List1 : ArrayList<Int> = ArrayList()
    var List2 : ArrayList<Int> = ArrayList()



    for (i in 1..5) {
        println("Introduzca valores para lista 1: ")
        List1.add(readLine()!!.toInt())

    }
    for (i in 1..5) {
        println("Introduzca valores para lista 2: ")
       List2.add(readLine()!!.toInt())

    }

    var num1 = sumaValores(List1);
    var num2 = sumaValores(List2);


    when {
        num1 > num2 -> println("Lista 1 mayor")
        num1 < num2 -> println("Lista 2 mayor")
        else -> println("Listas iguales")
    }
}

fun sumaValores(lista : ArrayList<Int>) : Int{
    var total =  0;
    lista.forEach{
        total += it }
    return total;
}