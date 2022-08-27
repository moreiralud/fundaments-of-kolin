//vararg é um argumento variavel. no java era 3 pontos.
fun ordenar(vararg numeros:Int): IntArray{
    return numeros.sortedArray()
    //sorted organiza de forma crescente
}

fun main (args:Array<String>){
    for (n in ordenar(23,93,1,24,13))
    print("$n ")
}
