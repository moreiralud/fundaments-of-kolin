class Pessoa1(var nome: String)
class Pessoa2(val nome: String)
class Pessoa3(nomeInicial : String){
    val nome: String = nomeInicial
}

fun main(args:Array<String>) {
    val p1 = Pessoa1(nome = "ludmila")
    p1.nome = "ludmila moreira"
    println("${p1.nome} sabe aprender!")

    val p2 = Pessoa2("Migson")
    val p3 =Pessoa3(nomeInicial = "Aparecida")
    println("${p2.nome} e ${p3.nome} são fofos")

}