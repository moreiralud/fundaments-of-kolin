import java.time.LocalDate
import java.time.Period


fun main(args:Array<String>) {

    val animais = listOf<Animal>(
        Animal("Migson","SRD", LocalDate.parse("2018-12-12"), "teste" , Address("Murilo Dantas", 1409, "Aracaju", cep = 49032490)) ,
        Animal("Cida", "SRD", LocalDate.parse("2020-12-12"), "teste",Address("Murilo Dantas", 1409, "Aracaju", cep = 49032490) ),
        Animal ("Arturito", "SRD", LocalDate.parse("2020-12-12"), "teste", Address("Murilo Dantas", 1409, "Aracaju", cep = 49032490)),
        Animal ("Millie", "SRD",LocalDate.parse("2022-12-12"), "teste",Address("Murilo Dantas", 1409, "Aracaju", cep = 49032490)),
        Animal ("Marley", "Labrador", LocalDate.parse("2000-12-12"), "teste", Address("Murilo Dantas", 1409, "Aracaju", cep = 49032490)),
        Animal ("Aurora", "SRD", LocalDate.parse("2021-12-12"), "teste", Address("Murilo Dantas", 1409, "Aracaju", cep = 49032490)),
        Animal ("Aquiles", "SRD", LocalDate.parse("2020-12-12"), "teste", Address("Murilo Dantas", 1409, "Aracaju", cep = 49032490)),
        Animal ("Granola", "SRD", LocalDate.parse("2012-12-12"), "teste", Address("Murilo Dantas", 1409, "Aracaju", cep = 49032490)),
        Animal ("Gesonel", "SRD", LocalDate.parse("2017-12-12"), "teste", Address("Murilo Dantas", 1409, "Aracaju", cep = 49032490)),
        Animal ("Bruma", "SRD", LocalDate.parse("2019-12-12"), "teste", Address("Murilo Dantas", 1409, "Aracaju", cep = 49032490))
    )

    fun retornaMaiorQueAno(ano: Int): MutableList<Animal>{
        val maisQueCinco = mutableListOf<Animal>()
        for (animal in animais) {
            val period = Period.between(animal.nascimento, LocalDate.now())
            if(period.years >= ano)
                maisQueCinco.add(animal)
        }
        return maisQueCinco
    }
    fun devolveLista(list: MutableList<Animal>){
        for (animal in list){
            println("name: ${animal.nome} and age: ${LocalDate.now().year - animal.nascimento.year}, City: ${animal.address.city}")
        }

    }

    devolveLista(retornaMaiorQueAno(3))

}

//adicionar classe de endereço dentro da classe de animal.
// Na hora de printar, informar também a rua e a cidade.
// remover a logica(função) para uma classe main