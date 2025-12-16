class Euro(valor: Double):Moeda(valor) {

    var nome: String = "Euro"
    override fun converteReal(): Double {
        valorReal = valor * 6.26
        return valorReal
    }

    override fun info() {
        println("Nome: $nome - Valor: $valor")
    }


}