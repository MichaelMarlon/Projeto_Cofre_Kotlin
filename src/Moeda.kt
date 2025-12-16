abstract class Moeda(val valor: Double) {
    var valorReal: Double = 0.0
    abstract fun converteReal(): Double
    abstract fun info()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true // Se for a mesma referência, é igual.
        if (other !is Moeda) return false // Se não for uma Moeda, não é igual.

        // Compara se o tipo de moeda é o mesmo e se o valor é o mesmo
        return javaClass == other.javaClass && valor == other.valor
    }


    override fun hashCode(): Int {
        var result = javaClass.hashCode()
        result = 31 * result + valor.hashCode()
        return result
    }
}