fun main(){

    println("Introduce un numero mayor o igual a 5 ");
    var texto = readLine()!!.toInt();

    piramideNormal(texto)
}

fun piramideNormal(texto: Int) {
    var espacios = texto
    var asteriscos = 1
    while (asteriscos <= texto * 2 - 1) {
        //Espacios
        for (i in 1..espacios) {
            print(" ")
        }
        //Asteriscos
        for (j in asteriscos downTo 1) {
            print("*")
        }
        println("")
        espacios--
        asteriscos += 2
    }
}
