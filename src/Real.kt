class Real(valor: Double):Moeda(valor) {

    val nome: String = "Real"

    override fun converteReal(): Double{
        valorReal = valor
        return  valorReal
    }

    override fun info() {
        println("Nome: $nome - Valor: $valor")

    }


}