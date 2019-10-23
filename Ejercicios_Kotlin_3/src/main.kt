fun main(){

    println("Introduce cuantos numeros para hacer la media: ")
    val num = readLine()!!.toInt()
    println("Introduce los $num para la media: ")


    var num2= 0
    for (i in 1..num) {

        val n = readLine()!!.toInt()
        num2+= n;
    }

    println("La media de lo numeros introducidos es :" +num2/num);
}

