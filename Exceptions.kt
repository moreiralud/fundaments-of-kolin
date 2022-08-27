fun main(args:Array<String>) {
//Todas as classes de exceção em Kotlin herdam a classe Throwable. Algumas infos podem ser passadas ao instanciar. Ex: mensagem(detailMessage), uma causa(cause) que pode ser nula significa q é inexistente ou desconhecida.


    throw Exception("Olá,sou uma exceção!")

    //para capturar uma exceção tente:

    fun main() {
        try {
            // trecho de código com divisão por zero
        } catch (ex: ArithmeticException) {
            // tratando a exceção NumberFormatException
        }
    }


    //pode-se tratar varias exceções para um mesmo bloco de código
    fun variasExcecoes() {
        try {
            // função de processamento de notas
        } catch (ex: ArithmeticException) {
            // tratando a exceção ArithmeticException
        } catch (ex: NumberFormatException) {
            // tratando a exceção NumberFormatException
        } catch (ex: Exception) {
            // tratando as exceções mais genéricas
        }


    }

    //try devolve um resultado
//    val resultado: Int? = try { converter(variavel) } catch (e: NumberFormatException) { null }

}