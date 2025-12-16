class Cofre {
    val listaMoedas: MutableList<Moeda> = mutableListOf()

    fun adicionar(moeda: Moeda){
        listaMoedas.add(moeda)
    }
    fun remover(moeda: Moeda){

        listaMoedas.remove(moeda)
    }
    fun listar(){
        for (moeda:Moeda in listaMoedas){
            moeda.info()
        }
    }
    fun converterReal(){
        var real: Double = 0.0
        var totReais: Double = 0.0

        for (moeda:Moeda in listaMoedas){
            real = moeda.converteReal()
            totReais += real

        }
        println("Total em reais $totReais")

    }
}