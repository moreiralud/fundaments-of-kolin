class Cliente2 {
    constructor(nome: String){
        this.nome = nome
    }
    var nome: String
        get() = "Meu nome é ${field}"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }
}