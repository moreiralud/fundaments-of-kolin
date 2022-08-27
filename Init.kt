class Filme3(nome: String, anoLancamento: Int, genero: String) {
    val nome: String
    val anoLancamento: Int
    val genero: String

    init {
        //inicializando as constantes (isso não é um construtor)
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {
    val filme = Filme3("jurassic park", 1993, "Ficção")
    println("O filme:${filme.nome} foi lançado em ${filme.anoLancamento} e seu gênero é ${filme.genero} ")
}