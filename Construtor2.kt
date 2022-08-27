class Filme2 (val nome:String, val anoLancamento: Int, val genero: String)

fun main(args: Array<String>){
    val filme = Filme2("Jurassic Park",1993, "Ação" )
    println("${filme.nome} foi lançado em ${filme.anoLancamento} e o um de seus gêneros é a ${filme.genero}")
}