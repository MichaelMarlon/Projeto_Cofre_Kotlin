class Dollar(valor: Double):Moeda(valor) {

    val nome: String = "Dollar"
    override fun converteReal(): Double {
        valorReal = valor * 5.37
        return valorReal
    }
    override fun info() {
        println("Nome: $nome - Valor: $valor")
    }


}