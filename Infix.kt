//infix

class Produto(val nome: String, val preco: Double)

infix fun Produto.maisCaroQue(produto:Produto): Boolean = this.preco > produto.preco

fun main(args: Array<String>){
    val p1 = Produto("cadeira", 800.20)
    val p2 = Produto("mesa", 900.20)

    println(p1 maisCaroQue p2)
    println(p2.maisCaroQue (p1))
}