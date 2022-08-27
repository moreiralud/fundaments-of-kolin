class Geladeira (val marca:String, val litros: Int)
data class Televisao (val marca:String, val polegadas: Int)

//o data class implementa o equals ao utilizar o ==

fun main(args:Array<String>) {
    val g1 = Geladeira("brastemp",320)
    val g2 = Geladeira("brastemp",320)

    println(g1 == g2) //chama o equals,se == endereço

    val tv1  = Televisao("samsung", 32)
    val tv2  = Televisao("samsung", 32)

    println(tv1 == tv2) //equals
    println(g1.toString())
    println(tv1.toString())
    println(tv1.copy())
    println(tv1.copy(polegadas = 50))


    //destructuring em data class
    val (marca, pol) = tv1
    println("$marca $pol")
}
