fun main() {
println("Introduce numero entero para ver su serie fibonacci: ")
var num = readLine()!!.toInt()

    var t1 = 0
    var t2 = 1

    println("La serie fibonacci de $num es: ")
    for (i in 1..num) {
        print("$t1 ")
        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}