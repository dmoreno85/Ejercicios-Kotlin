
fun main() {

    println("introduce un numero entre 7 y 30: ")
    var num = readLine()!!.toInt();
    var respaldo = num / 2
    var sillon = respaldo +1
    var patas = respaldo -1

    for (i in 1..respaldo) {

        println("*")
    }
    for (j in 1..sillon) {
        print("*")
    if (j == sillon) println("")
    }
    for (h in 1..patas) {

        for (w in 1..sillon){
            if ( w == 1 || w == sillon)print("*")
            else print(" ")
        }
        println()
    }
}
