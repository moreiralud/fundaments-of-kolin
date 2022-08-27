

class Filme {
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento: Int, genero: String){
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}
    fun main(args: Array<String>){
        val filme = Filme("Relatos Selvagens", 2014,"Thriller/Comédia" )
        println("${filme.nome} foi lançado em ${filme.anoLancamento}. Seu gênero é ${filme.genero}")
    }

//No Kotlin é chamado através através do constructor e no Java recebe o mesmo nome da classe.
//Retorna uma instância. Inacializar as variáveis e as constantes.