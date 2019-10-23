fun main() {
    var par = 0
    var impar = 0
    println("Introduce cuantos numeros enteros quieres comparar: ")
    var num = readLine()!!.toInt()
    println("Introduce los $num para comparar: ")
    for (i in 1..num) {
        var n = readLine()!!.toInt()
        when {
            n % 2 == 0 -> par++
            else -> impar++
        }
    }
    println("$par fueron numeros pares")
    println("$impar fueron numeros impares")
}