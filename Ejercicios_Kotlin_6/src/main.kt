fun main() {
    var cero = 0
    var uno = 0
    var dos = 0
    var mas = 0
    for (i in 1..10) {
        println("Introduce numeros de hijos para cada familia: ")
        var num = readLine()!!.toInt()
        when (num) {
            0 -> cero++
            1 -> uno++
            2 -> dos++
            else -> mas++
        }
    }
    println("En $cero familias tienen 0 hijos")
    println("En $uno familias tienen 1 hijos")
    println("En $dos familias tienen 2 hijos")
    println("En $mas familias tienen mas de 2 hijos")
}





