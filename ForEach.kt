fun main(args: Array<String>) {
    data class Paises(var nome: String, var idade: Int)

//list é imutável
    val paisesVisitados = listOf(
        Paises("Brasil", 520),
        Paises("Argentina", 206),
        Paises("Chile", 473),
        Paises("Portugal", 876))

//iterando lista com forEach
    paisesVisitados.forEach {
        println(it.nome)
        println(it.idade)
    }

//retornando uma lista imutável através de uma lista mutável
    val futurasViagens = mutableListOf<Paises>(
        Paises("Colômbia", 523),
        Paises("Nova Iorque", 398))

    //apenas visualização dos itens
    fun getProdutos(): List<Paises> = futurasViagens
    println(futurasViagens)

    println("adicionando um novo elemento a lista")
    futurasViagens.add(Paises("Egito", 3000))
    println(futurasViagens)

    println("adicionando multiplos elementos")
    futurasViagens.addAll(futurasViagens)
    println(futurasViagens)
}

