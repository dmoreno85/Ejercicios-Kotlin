fun main() {
    var nota1 = 0
    var nota2 = 0
    for (i in 1..10) {
        println("Ingrese las Notas de los alumnos")
        var num = readLine()!!.toInt()
        if (num >= 7) nota1++
        else nota2++
    }
    println("$nota1 Tienen nota mayor o igual a 7")
    println("$nota2 Tienen nota menor a 7")
}