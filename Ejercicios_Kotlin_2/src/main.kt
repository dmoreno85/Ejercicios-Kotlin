fun main(args: Array<String>) {
    print("Introduzca un numero de kb a convertir: ")
    val num= readLine()!!.toInt()
    val l = num.toDouble()
    val c = 1024
    val b = l / c.toDouble()
    println("El numero $num equivale a  $b Mb")
}
